package com.mapbox.maps;

import android.content.Context;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import j20.x;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aW\u0010\r\u001a\u00028\u0002\"\u0006\b\u0000\u0010\u0007\u0018\u0001\"\u0006\b\u0001\u0010\b\u0018\u0001\"\u0016\b\u0002\u0010\u0000\u0018\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\u001a\b\u0004\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0003H\u0080Hø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u000f*\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"T", "R", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", FirebaseAnalytics.Param.METHOD, "call", "(Ljava/lang/ref/WeakReference;Le23/l;)Ljava/lang/Object;", "E", "V", "Lcom/mapbox/bindgen/Expected;", "Lt13/d;", "Lcom/mapbox/common/Cancelable;", "block", "suspendMapboxCancellableCoroutine", "(Le23/l;Lt13/d;)Ljava/lang/Object;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "toDP", "(Ljava/lang/Number;Landroid/content/Context;)Ljava/lang/Number;", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UtilsKt {
    public static final <T, R> R call(WeakReference<T> weakReference, e23.l<? super T, ? extends R> lVar) {
        weakReference.getClass();
        lVar.getClass();
        T t7 = weakReference.get();
        if (t7 != null) {
            return lVar.invoke(t7);
        }
        x.h();
        return null;
    }

    public static final <E, V, T extends Expected<E, V>> Object suspendMapboxCancellableCoroutine(e23.l<? super t13.d<? super T>, ? extends Cancelable> lVar, t13.d<? super T> dVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        kVar.r(new UtilsKt$suspendMapboxCancellableCoroutine$2$1(lVar.invoke(kVar)));
        Unit unit = Unit.INSTANCE;
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final <T extends Number> T toDP(T t7, Context context) {
        t7.getClass();
        context.getClass();
        return Float.valueOf(TypedValue.applyDimension(1, t7.floatValue(), context.getResources().getDisplayMetrics()));
    }
}
