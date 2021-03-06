package com.fanwe.www.gridlayout.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fanwe.library.adapter.SDSimpleAdapter;
import com.fanwe.www.gridlayout.DataModel;
import com.fanwe.www.gridlayout.R;

import java.util.List;

/**
 * Created by Administrator on 2017/7/17.
 */

public class ListViewAdapter extends SDSimpleAdapter<DataModel>
{
    public ListViewAdapter(List<DataModel> listModel, Activity activity)
    {
        super(listModel, activity);
    }

    @Override
    public int getLayoutId(int position, View convertView, ViewGroup parent)
    {
        return R.layout.item_listview;
    }

    @Override
    public void bindData(int position, View convertView, ViewGroup parent, DataModel model)
    {
        TextView tv_position = get(R.id.tv_position, convertView);
        tv_position.setText(String.valueOf(position));

//        if (position % 2 == 0)
//        {
//            convertView.setLayoutParams(new ViewGroup.LayoutParams(-1, 100));
//        } else
//        {
//            convertView.setLayoutParams(new ViewGroup.LayoutParams(-1, 200));
//        }

//        if (position % 2 == 0)
//        {
//            convertView.setLayoutParams(new ViewGroup.LayoutParams(100, -1));
//        } else
//        {
//            convertView.setLayoutParams(new ViewGroup.LayoutParams(200, -1));
//        }
    }
}
