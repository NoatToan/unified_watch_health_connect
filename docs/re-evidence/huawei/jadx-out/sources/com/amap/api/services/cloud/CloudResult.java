package com.amap.api.services.cloud;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class CloudResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<CloudItem> f3523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3524c;
    private int d;
    private CloudSearch.Query e;
    private CloudSearch.SearchBound f;

    public static CloudResult createPagedResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        return new CloudResult(query, i, searchBound, i2, arrayList);
    }

    private CloudResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        this.e = query;
        this.f3524c = i;
        this.d = i2;
        this.f3522a = a(i);
        this.f3523b = arrayList;
        this.f = searchBound;
    }

    public final int getPageCount() {
        return this.f3522a;
    }

    public final CloudSearch.Query getQuery() {
        return this.e;
    }

    public final CloudSearch.SearchBound getBound() {
        return this.f;
    }

    public final ArrayList<CloudItem> getClouds() {
        return this.f3523b;
    }

    public final int getTotalCount() {
        return this.f3524c;
    }

    private int a(int i) {
        int i2 = this.d;
        return ((i + i2) - 1) / i2;
    }
}
