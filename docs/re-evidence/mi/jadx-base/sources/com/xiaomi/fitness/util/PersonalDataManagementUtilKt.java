package com.xiaomi.fitness.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.mine.personal.data.management.data.model.AuthManagementType;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.m0j;
import defpackage.pji;
import defpackage.vni;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u001aA\u0010\b\u001a\u00020\u0001*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"loadImageWithUrlWithDefaultHandled", "", "Landroid/widget/ImageView;", "url", "", "getAuthTypeNameStr", "authType", "", "setHyperTextClickableLink", "Landroid/widget/TextView;", "wholeText", "termTitleArray", "", "urls", "urlTitles", "(Landroid/widget/TextView;Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;)V", "mine_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPersonalDataManagementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalDataManagementUtil.kt\ncom/xiaomi/fitness/util/PersonalDataManagementUtilKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,91:1\n54#2,3:92\n24#2:95\n59#2,4:96\n63#2,2:109\n844#3,9:100\n13467#4,3:111\n*S KotlinDebug\n*F\n+ 1 PersonalDataManagementUtil.kt\ncom/xiaomi/fitness/util/PersonalDataManagementUtilKt\n*L\n33#1:92,3\n33#1:95\n33#1:96,4\n33#1:109,2\n36#1:100,9\n67#1:111,3\n*E\n"})
public final class PersonalDataManagementUtilKt {
    @NotNull
    public static final String getAuthTypeNameStr(@AuthManagementType int i) {
        if (i == 1) {
            return ResourceExtKt.getString(m0j.q);
        }
        if (i == 2) {
            return ResourceExtKt.getString(m0j.s);
        }
        if (i != 3) {
            return i != 4 ? "" : ResourceExtKt.getString(m0j.f25625r);
        }
        return ResourceExtKt.getString(m0j.p);
    }

    public static final void loadImageWithUrlWithDefaultHandled(@NotNull final ImageView imageView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str == null || TextUtils.isEmpty(str)) {
            imageView.setImageResource(vni.q);
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        ViewExtKt.setWidthAndHeight(imageView, ExtUtilsKt.getDp(Double.valueOf(36.67d)), ExtUtilsKt.getDp(Double.valueOf(36.67d)));
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.util.PersonalDataManagementUtilKt$loadImageWithUrlWithDefaultHandled$lambda$2$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imageView.setImageResource(vni.q);
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                imageView.setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        builderTarget.placeholder(vni.q);
        imageLoader.enqueue(builderTarget.build());
    }

    public static final void setHyperTextClickableLink(@NotNull TextView textView, @NotNull String wholeText, @NotNull Integer[] termTitleArray, @NotNull final String[] urls, @NotNull final String[] urlTitles) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(wholeText, "wholeText");
        Intrinsics.checkNotNullParameter(termTitleArray, "termTitleArray");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(urlTitles, "urlTitles");
        SpannableString spannableString = new SpannableString(wholeText);
        int length = termTitleArray.length;
        int i = 0;
        final int i2 = 0;
        while (i < length) {
            String string = ResourceExtKt.getString(termTitleArray[i].intValue());
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) wholeText, string, 0, false, 6, (Object) null);
            spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.util.PersonalDataManagementUtilKt$setHyperTextClickableLink$1$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    String[] strArr = urls;
                    int i3 = i2;
                    WebViewUtilKt.startWebView$default(strArr[i3], urlTitles[i3], false, false, null, false, null, false, 252, null);
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                    ds.setColor(ResourceExtKt.getResourceColor(ApplicationExtKt.getApplication(), pji.f30465a));
                    ds.setFakeBoldText(false);
                }
            }, iIndexOf$default, string.length() + iIndexOf$default, 17);
            i++;
            i2++;
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
