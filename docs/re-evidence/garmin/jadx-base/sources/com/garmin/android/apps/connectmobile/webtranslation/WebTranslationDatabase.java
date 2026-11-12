package com.garmin.android.apps.connectmobile.webtranslation;

import androidx.room.b0;
import i31.e;
import i42.h;
import o13.m;
import o13.t;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/WebTranslationDatabase;", "Landroidx/room/b0;", "<init>", "()V", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class WebTranslationDatabase extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f47964a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f47965b = m.b(new e(3));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/webtranslation/WebTranslationDatabase$a", "Landroidx/room/b0$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends b0.b {
        @Override // androidx.room.b0.b
        public final void a(vd.c cVar) {
            cVar.getClass();
            cVar.k3("PRAGMA foreign_keys=ON;");
        }
    }

    public abstract h e();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/webtranslation/WebTranslationDatabase$b;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "", "DATABASE_NAME", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements KoinComponent {
        public /* synthetic */ b(j jVar) {
            this();
        }

        @Override // org.koin.core.component.KoinComponent
        public final /* bridge */ Koin getKoin() {
            return KoinComponent.DefaultImpls.getKoin(this);
        }

        private b() {
        }
    }
}
