package com.huawei.openalliance.ad;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<Integer> f20286a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<Integer, SoftReference<tf>> f20287b = new ConcurrentHashMap<>();

    private static tf b(Context context, int i) {
        if (i == -1) {
            return new sp(context);
        }
        if (i == 7) {
            return new tb(context);
        }
        if (i != 18) {
            if (i == 60) {
                return new ta(context);
            }
            if (i != 1) {
                return i != 2 ? new sz(context, i) : new sy(context);
            }
        }
        return new tc(context, i);
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        Iterator<Integer> it = f20286a.iterator();
        while (it.hasNext()) {
            a(context, it.next().intValue()).b();
        }
    }

    public static tf a(Context context, int i) {
        SoftReference<tf> softReference = f20287b.get(Integer.valueOf(i));
        tf tfVar = softReference != null ? softReference.get() : null;
        if (tfVar != null) {
            return tfVar;
        }
        tf tfVarB = b(context, i);
        f20287b.put(Integer.valueOf(i), new SoftReference<>(tfVarB));
        return tfVarB;
    }

    static {
        f20286a.add(1);
        f20286a.add(-1);
        f20286a.add(60);
        f20286a.add(7);
        f20286a.add(3);
        f20286a.add(8);
        f20286a.add(9);
        f20286a.add(12);
        f20286a.add(13);
        f20286a.add(18);
        f20286a.add(2);
    }
}
