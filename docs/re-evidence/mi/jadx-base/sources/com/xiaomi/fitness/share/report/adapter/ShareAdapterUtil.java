package com.xiaomi.fitness.share.report.adapter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.mi.health.search.SearchContract;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.hoi;
import defpackage.j1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/ShareAdapterUtil;", "", "<init>", "()V", "TYPE_SHOW_SLOGAN_RECTANGLE", "", "TYPE_SHOW_STICKER_RECTANGLE", "TYPE_SHOW_BASIC_INFO_RECTANGLE", "TYPE_SHOW_SLOGAN_SQUARE", "TYPE_SHOW_STICKER_SQUARE", "TYPE_SHOW_BASIC_INFO_SQUARE", "context", "Landroid/app/Application;", "getContext", "()Landroid/app/Application;", "showAlgoDataSource", "", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "textViewCenter", "Landroid/widget/TextView;", "textViewLeft", "lineLayout", "Landroid/view/View;", "showSlogan", "", "bottomData", "insertIconInText", "Landroid/text/SpannableString;", "Landroid/content/Context;", "originalText", "", "targetSubstring", SearchContract.COLUMN_ICON_RESID, "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareAdapterUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareAdapterUtil.kt\ncom/xiaomi/fitness/share/report/adapter/ShareAdapterUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class ShareAdapterUtil {
    public static final int TYPE_SHOW_BASIC_INFO_RECTANGLE = 2;
    public static final int TYPE_SHOW_BASIC_INFO_SQUARE = 3;
    public static final int TYPE_SHOW_SLOGAN_RECTANGLE = 0;
    public static final int TYPE_SHOW_SLOGAN_SQUARE = 5;
    public static final int TYPE_SHOW_STICKER_RECTANGLE = 1;
    public static final int TYPE_SHOW_STICKER_SQUARE = 4;

    @NotNull
    public static final ShareAdapterUtil INSTANCE = new ShareAdapterUtil();

    @NotNull
    private static final Application context = AppUtil.getApp();

    private ShareAdapterUtil() {
    }

    public static /* synthetic */ void showAlgoDataSource$default(ShareAdapterUtil shareAdapterUtil, SportBasicReport sportBasicReport, TextView textView, TextView textView2, View view, boolean z, boolean z2, int i, Object obj) {
        if ((i & 32) != 0) {
            z2 = false;
        }
        shareAdapterUtil.showAlgoDataSource(sportBasicReport, textView, textView2, view, z, z2);
    }

    @NotNull
    public final Application getContext() {
        return context;
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    @NotNull
    public final SpannableString insertIconInText(@NotNull Context context2, @NotNull String originalText, @NotNull String targetSubstring, int iconResId) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        Intrinsics.checkNotNullParameter(targetSubstring, "targetSubstring");
        Drawable drawable = context2.getDrawable(iconResId);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        ImageSpan imageSpan = drawable != null ? new ImageSpan(drawable, 1) : null;
        SpannableString spannableString = new SpannableString(originalText);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) originalText, targetSubstring, 0, false, 6, (Object) null) + targetSubstring.length();
        int length = targetSubstring.length() + iIndexOf$default;
        if (iIndexOf$default != -1 && imageSpan != null) {
            spannableString.setSpan(imageSpan, iIndexOf$default, length, 17);
        }
        return spannableString;
    }

    public final void showAlgoDataSource(@Nullable SportBasicReport sportReport, @NotNull TextView textViewCenter, @NotNull TextView textViewLeft, @NotNull View lineLayout, boolean showSlogan, boolean bottomData) {
        Integer algorithmDataSource;
        Intrinsics.checkNotNullParameter(textViewCenter, "textViewCenter");
        Intrinsics.checkNotNullParameter(textViewLeft, "textViewLeft");
        Intrinsics.checkNotNullParameter(lineLayout, "lineLayout");
        if (bottomData) {
            ViewExtKt.setVisible(lineLayout, false);
            ViewExtKt.setVisible(textViewLeft, false);
            return;
        }
        if (sportReport == null || (algorithmDataSource = sportReport.getAlgorithmDataSource()) == null || algorithmDataSource.intValue() != 1) {
            textViewCenter.setVisibility(8);
            lineLayout.setVisibility(8);
            textViewLeft.setVisibility(8);
            return;
        }
        Application application = context;
        String string = application.getString(j1j.D2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = application.getString(j1j.E2);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableString spannableStringInsertIconInText = insertIconInText(application, string, string2, hoi.a2);
        String string3 = application.getString(j1j.D2);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = application.getString(j1j.E2);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        SpannableString spannableStringInsertIconInText2 = insertIconInText(application, string3, string4, hoi.a2);
        textViewCenter.setText(spannableStringInsertIconInText);
        textViewLeft.setText(spannableStringInsertIconInText2);
        if (showSlogan) {
            lineLayout.setVisibility(8);
            textViewCenter.setVisibility(0);
            textViewLeft.setVisibility(8);
        } else {
            lineLayout.setVisibility(0);
            textViewLeft.setVisibility(0);
            textViewCenter.setVisibility(8);
        }
    }
}
