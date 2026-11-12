package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import com.huawei.pluginachievement.manager.model.MedalInfo;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.NewMedalDataBean;
import defpackage.njy;
import defpackage.pas;
import defpackage.pbe;
import defpackage.pbg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class MedalExpandableAdapter extends BaseExpandableListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pbe f22188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pbg f22189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, String> f22190c = new HashMap(8);
    private Map<String, ArrayList<MedalInfoDesc>> e;

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i, int i2) {
        return i2;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i) {
        return i;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public MedalExpandableAdapter(Context context, Map<String, ArrayList<MedalInfoDesc>> map, Map<Integer, String> map2) {
        if (map2 == null || map == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < map2.size(); i2++) {
            String str = map2.get(Integer.valueOf(i2));
            if (!TextUtils.isEmpty(str) && njy.b(map.get(str))) {
                this.f22190c.put(Integer.valueOf(i), map2.get(Integer.valueOf(i2)));
                i++;
            }
        }
        this.e = map;
        Map<String, MedalInfo> mapD = pas.d().d(false);
        this.f22189b = new pbg(context, map, this.f22190c, mapD);
        this.f22188a = new pbe(context, map, this.f22190c, mapD);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        Map<Integer, String> map = this.f22190c;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i) {
        return this.f22190c == null ? 0 : 1;
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NewMedalDataBean getGroup(int i) {
        NewMedalDataBean newMedalDataBean = new NewMedalDataBean();
        Map<Integer, String> map = this.f22190c;
        if (map != null && this.e != null) {
            String str = map.get(Integer.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                ArrayList<MedalInfoDesc> arrayList = this.e.get(str);
                if (!njy.e(arrayList)) {
                    ArrayList<MedalInfoDesc> arrayList2 = new ArrayList<>(8);
                    if (njy.c(arrayList, 0)) {
                        arrayList2.add(arrayList.get(0));
                    }
                    if (njy.c(arrayList, 1)) {
                        arrayList2.add(arrayList.get(1));
                    }
                    if (njy.c(arrayList, 2)) {
                        arrayList2.add(arrayList.get(2));
                    }
                    NewMedalDataBean.ChildMedalDataBean childMedalDataBean = new NewMedalDataBean.ChildMedalDataBean();
                    ArrayList<NewMedalDataBean.ChildMedalDataBean> arrayList3 = new ArrayList<>(8);
                    childMedalDataBean.setMedalInfoList(arrayList2);
                    arrayList3.add(childMedalDataBean);
                    newMedalDataBean.setTitle(str);
                    newMedalDataBean.setChildMedalDataList(arrayList3);
                }
            }
        }
        return newMedalDataBean;
    }

    @Override // android.widget.ExpandableListAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public NewMedalDataBean.ChildMedalDataBean getChild(int i, int i2) {
        NewMedalDataBean.ChildMedalDataBean childMedalDataBean = new NewMedalDataBean.ChildMedalDataBean();
        Map<Integer, String> map = this.f22190c;
        if (map != null && this.e != null) {
            String str = map.get(Integer.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                ArrayList<MedalInfoDesc> arrayList = this.e.get(str);
                if (!njy.e(arrayList)) {
                    ArrayList<MedalInfoDesc> arrayList2 = new ArrayList<>();
                    if (njy.c(arrayList, 0)) {
                        arrayList2.add(arrayList.get(0));
                    }
                    if (njy.c(arrayList, 1)) {
                        arrayList2.add(arrayList.get(1));
                    }
                    if (njy.c(arrayList, 2)) {
                        arrayList2.add(arrayList.get(2));
                    }
                    childMedalDataBean.setMedalInfoList(arrayList2);
                }
            }
        }
        return childMedalDataBean;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        return this.f22189b.c(i, z, view);
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        return this.f22188a.e(i, view);
    }
}
