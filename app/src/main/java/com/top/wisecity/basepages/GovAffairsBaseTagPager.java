package com.top.wisecity.basepages;

import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;

/**
 * @author 李阳
 * @创建时间 2017-02-28  下午1:12
 * @描述 TODO
 * @ 当前版本:
 */
public class GovAffairsBaseTagPager extends BaseTagPage {

    public GovAffairsBaseTagPager(Context context) {
        super(context);
    }

    @Override
    public void initData() {
        super.initData();
        tv_title.setText("政务");


        //要展示的内容

        TextView tv=new TextView(mainActivity);
        tv.setText("政务的内容");
        tv.setTextSize(25);
        tv.setGravity(Gravity.CENTER);
        //替换掉白纸
        fl_content.addView(tv);

        super.initData();
    }
}
