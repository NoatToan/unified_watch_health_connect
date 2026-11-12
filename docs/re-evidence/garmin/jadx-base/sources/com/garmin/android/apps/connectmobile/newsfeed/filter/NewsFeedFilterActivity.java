package com.garmin.android.apps.connectmobile.newsfeed.filter;

import am.x0;
import androidx.fragment.app.Fragment;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/NewsFeedFilterActivity;", "Ld10/a;", "Lnz0/b;", "Lcom/garmin/android/apps/connectmobile/newsfeed/filter/b$b;", "<init>", "()V", "a", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewsFeedFilterActivity extends d10.a<nz0.b> implements b.InterfaceC0709b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39527b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nz0.b f39528a;

    public NewsFeedFilterActivity() {
        mz0.a.f121640a.getClass();
        nz0.b bVarA = mz0.a.a();
        nz0.b bVar = new nz0.b(null, null, 3, null);
        bVar.f128379a.addAll(bVarA.f128379a);
        bVar.f128380b.addAll(bVarA.f128380b);
        this.f39528a = bVar;
    }

    @Override // d10.c
    public final void N3() {
        nz0.b bVar = this.f39528a;
        bVar.f128379a.clear();
        bVar.f128380b.clear();
    }

    @Override // d10.b
    public final Object O() {
        return this.f39528a;
    }

    @Override // d10.a
    public final Fragment ca() {
        b.f39532e.getClass();
        return new b();
    }

    @Override // d10.c
    public final void d2() {
        mz0.a.f121640a.getClass();
        nz0.b bVarA = mz0.a.a();
        bVarA.f128379a.clear();
        Set<nz0.a> set = bVarA.f128379a;
        nz0.b bVar = this.f39528a;
        set.addAll(bVar.f128379a);
        Set<x0> set2 = bVarA.f128380b;
        set2.clear();
        set2.addAll(bVar.f128380b);
        setResult(-1);
        finish();
    }

    @Override // d10.c
    public final boolean g8() {
        return this.f39528a.d();
    }

    @Override // com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b
    public final void q5() {
        c.f39534c.getClass();
        da(new c());
    }

    @Override // com.garmin.android.apps.connectmobile.newsfeed.filter.b.InterfaceC0709b
    public final void v2() {
        com.garmin.android.apps.connectmobile.newsfeed.filter.a.f39529d.getClass();
        da(new com.garmin.android.apps.connectmobile.newsfeed.filter.a());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/newsfeed/filter/NewsFeedFilterActivity$a;", "", "<init>", "()V", "gcm-newsfeed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
