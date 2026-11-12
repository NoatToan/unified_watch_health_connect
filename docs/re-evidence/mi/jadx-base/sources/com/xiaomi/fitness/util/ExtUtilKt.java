package com.xiaomi.fitness.util;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.q8p;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0086\bø\u0001\u0000\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0003\u001a\u001e\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0086\bø\u0001\u0000\u001a\n\u0010\f\u001a\u00020\u0003*\u00020\u0003\u001a\u001e\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0086\bø\u0001\u0000\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0014\u001a\n\u0010\u0015\u001a\u00020\u0013*\u00020\u0014\u001a\u0010\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u0011\u001a\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011\u001a\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u001c\u001a\u0006\u0010\u001d\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"density", "", "visible", "Landroid/view/View;", "isVisible", "", "isGone", "visibleIf", "condition", "Lkotlin/Function0;", "invisible", "invisibleIf", "gone", "goneIf", "getString", "", "id", "", "getMills", "", "Lorg/joda/time/LocalDate;", "getZeroMills", "getDimension", "dimen", "dp2Px", "dp", "getExtensionFromContentUri", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "isRTLDirection", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtUtilKt {
    private static final float density = Resources.getSystem().getDisplayMetrics().density;

    public static final int dp2Px(int i) {
        return (int) ((i * density) + 0.5f);
    }

    public static final int getDimension(int i) {
        return ApplicationExtKt.getApplication().getResources().getDimensionPixelSize(i);
    }

    @Nullable
    public static final String getExtensionFromContentUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullExpressionValue(singleton, "getSingleton(...)");
        return singleton.getExtensionFromMimeType(ApplicationExtKt.getApplication().getContentResolver().getType(uri));
    }

    public static final long getMills(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return localDate.toDate().getTime();
    }

    @NotNull
    public static final String getString(int i) {
        String string = ApplicationExtKt.getApplication().getResources().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final long getZeroMills(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        return TimeDateUtil.changZeroOfTheDay(localDate) * ((long) 1000);
    }

    @NotNull
    public static final View gone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
        return view;
    }

    @NotNull
    public static final View goneIf(@NotNull View view, @NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        if (view.getVisibility() != 8 && condition.invoke().booleanValue()) {
            view.setVisibility(8);
        }
        return view;
    }

    @NotNull
    public static final View invisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        return view;
    }

    @NotNull
    public static final View invisibleIf(@NotNull View view, @NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        if (view.getVisibility() != 4 && condition.invoke().booleanValue()) {
            view.setVisibility(4);
        }
        return view;
    }

    public static final boolean isGone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isRTLDirection() {
        return q8p.a(Locale.getDefault()) == 1;
    }

    public static final boolean isVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    @NotNull
    public static final View visible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        return view;
    }

    @NotNull
    public static final View visibleIf(@NotNull View view, @NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        if (view.getVisibility() != 0 && condition.invoke().booleanValue()) {
            view.setVisibility(0);
        }
        return view;
    }
}
