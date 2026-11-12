package com.huami.watch.dataflow.sync.bean;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class ComplexSportData extends BaseSportData {

    @Expose
    private ArrayList<SingleSportData> children;

    @Expose
    private SingleSportData parent;

    public ComplexSportData() {
        super(false);
        this.parent = new SingleSportData();
        this.children = new ArrayList<>();
    }

    public ArrayList<SingleSportData> getChildren() {
        return this.children;
    }

    public SingleSportData getParent() {
        return this.parent;
    }

    public void setChildren(ArrayList<SingleSportData> arrayList) {
        this.children = arrayList;
    }

    public void setParent(SingleSportData singleSportData) {
        this.parent = singleSportData;
    }
}
