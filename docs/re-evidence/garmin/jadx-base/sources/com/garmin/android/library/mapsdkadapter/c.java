package com.garmin.android.library.mapsdkadapter;

import android.content.Context;
import android.location.Geocoder;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import o53.s0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/c;", "Lcom/garmin/android/library/mapsdkadapter/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/Locale;", "locale", "<init>", "(Landroid/content/Context;Ljava/util/Locale;)V", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Geocoder f50263a;

    static {
        new a(null);
    }

    public c(Context context, Locale locale) {
        context.getClass();
        locale.getClass();
        this.f50263a = new Geocoder(context, locale);
    }

    @Override // com.garmin.android.library.mapsdkadapter.h
    public final Object a(f fVar, v13.c cVar) {
        i.d dVar = i.d.GOOGLE;
        fVar.getClass();
        dVar.getClass();
        f fVarG = fVar.g(m.c(fVar.f50283a, dVar));
        if (fVarG == null) {
            fVar.toString();
            return j0.f134944a;
        }
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new ie2.a(this, fVarG, 1, null), cVar);
    }

    @Override // com.garmin.android.library.mapsdkadapter.h
    public final Object b(String str, v13.c cVar) {
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new ie2.b(this, str, 1, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/library/mapsdkadapter/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(Context context, Locale locale, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        this(context, locale);
    }
}
