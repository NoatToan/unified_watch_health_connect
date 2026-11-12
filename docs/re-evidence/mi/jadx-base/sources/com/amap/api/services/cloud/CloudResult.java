package com.amap.api.services.cloud;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class CloudResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<CloudItem> f6523b;
    private int c;
    private int d;
    private CloudSearch.Query e;
    private CloudSearch.SearchBound f;

    private CloudResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        this.e = query;
        this.c = i;
        this.d = i2;
        this.f6522a = a(i);
        this.f6523b = arrayList;
        this.f = searchBound;
    }

    private int a(int i) {
        int i2 = this.d;
        return ((i + i2) - 1) / i2;
    }

    public static CloudResult createPagedResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        return new CloudResult(query, i, searchBound, i2, arrayList);
    }

    public final CloudSearch.SearchBound getBound() {
        return this.f;
    }

    public final ArrayList<CloudItem> getClouds() {
        return this.f6523b;
    }

    public final int getPageCount() {
        return this.f6522a;
    }

    public final CloudSearch.Query getQuery() {
        return this.e;
    }

    public final int getTotalCount() {
        return this.c;
    }
}
