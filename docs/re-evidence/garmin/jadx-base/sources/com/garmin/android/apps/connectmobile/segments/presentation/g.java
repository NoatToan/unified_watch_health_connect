package com.garmin.android.apps.connectmobile.segments.presentation;

import android.util.Pair;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/g;", "", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41446b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f41447c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<? extends Pair<Long, String>> f41448a;

    public /* synthetic */ g(j jVar) {
        this();
    }

    public final List a() {
        List<? extends Pair<Long, String>> list = this.f41448a;
        if (list == null || list.size() == 0) {
            this.f41448a = ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).d();
        }
        List<? extends Pair<Long, String>> list2 = this.f41448a;
        list2.getClass();
        return list2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/g$a;", "", "<init>", "()V", "Lcom/garmin/android/apps/connectmobile/segments/presentation/g;", "_instance", "Lcom/garmin/android/apps/connectmobile/segments/presentation/g;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public final synchronized g a() {
            try {
                if (g.f41447c == null) {
                    g.f41447c = new g(null);
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return g.f41447c;
        }

        private a() {
        }
    }

    private g() {
    }
}
