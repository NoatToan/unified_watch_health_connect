package com.garmin.android.apps.connectmobile.newsfeed;

import hq.f0;
import java.util.ArrayList;
import java.util.List;
import li0.d0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import t13.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/a;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39473a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qz0.a f39474b = new qz0.a(null, null, null, null, null, 0, false, false, null, false, false, 2047, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f39475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b2 f39476d;

    static {
        u53.d dVarA = c0.a(g.a.C3052a.d(s0.f129406a, ge1.b.h()));
        p2 p2VarA = q2.a(j0.f134944a);
        f39475c = p2VarA;
        f39476d = s.d(p2VarA);
        yf0.b bVar = yf0.b.f196864a;
        f0 f0Var = new f0(24);
        k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(ki0.a.class);
        bVar.getClass();
        ge1.b.T(dVarA, null, null, new yf0.a(dVarB, f0Var, null), 3);
    }

    private a() {
    }

    public static List a() {
        List<d0> suggestedFollowingList;
        List<NewsFeedItem> list = f39474b.f148598a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof NewsFeedItem.SuggestedFollowingList) {
                arrayList.add(obj);
            }
        }
        NewsFeedItem.SuggestedFollowingList suggestedFollowingList2 = (NewsFeedItem.SuggestedFollowingList) h0.d0(arrayList);
        return (suggestedFollowingList2 == null || (suggestedFollowingList = suggestedFollowingList2.getSuggestedFollowingList()) == null) ? new ArrayList() : suggestedFollowingList;
    }
}
