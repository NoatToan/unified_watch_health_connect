package com.unionpay;

import java.util.Comparator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f10768a;

    public f(String str) {
        this.f10768a = str;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        long jOptLong = ((JSONObject) obj).optLong(this.f10768a);
        long jOptLong2 = ((JSONObject) obj2).optLong(this.f10768a);
        if (jOptLong < jOptLong2) {
            return -1;
        }
        return jOptLong > jOptLong2 ? 1 : 0;
    }
}
