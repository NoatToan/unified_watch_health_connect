package com.huami.module.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u0006J\"\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/module/utils/VectorDrawablePathColorHelper;", "", "Landroid/graphics/drawable/Drawable;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "vectorResId", "Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;", "a", "tint", "setTint", "", "path", "color", "", "fillColor", "setPartPathColor", "create", "Landroid/content/Context;", LogUtil.I, "", "Lcom/huami/module/utils/a;", "c", "Ljava/util/List;", "entryList", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "tintColor", "<init>", "(Landroid/content/Context;I)V", "hm-ktx_release"}, k = 1, mv = {1, 5, 1})
public final class VectorDrawablePathColorHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int vectorResId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<VectorEntry> entryList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Integer tintColor;

    public VectorDrawablePathColorHelper(@NotNull Context context, @DrawableRes int i) {
        this.context = context;
        this.vectorResId = i;
    }

    private final VectorDrawableCompat a(Context context, @DrawableRes int vectorResId) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(vectorResId);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), (XmlPullParser) xml, attributeSetAsAttributeSet, (Resources.Theme) null);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e(VectorDrawableCompat.LOGTAG, "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e(VectorDrawableCompat.LOGTAG, "parser error", e2);
            return null;
        }
    }

    private final Drawable b() {
        VectorDrawableCompat vectorDrawableCompatA = a(this.context, this.vectorResId);
        if (vectorDrawableCompatA != null) {
            try {
                Class<?> cls = vectorDrawableCompatA.getClass();
                Method declaredMethod = cls.getDeclaredMethod("setAllowCaching", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(vectorDrawableCompatA, Boolean.FALSE);
                Method declaredMethod2 = cls.getDeclaredMethod("getTargetByName", String.class);
                declaredMethod2.setAccessible(true);
                for (VectorEntry vectorEntry : this.entryList) {
                    Object objInvoke = declaredMethod2.invoke(vectorDrawableCompatA, vectorEntry.h());
                    Method declaredMethod3 = objInvoke.getClass().getDeclaredMethod(vectorEntry.f() ? "setFillColor" : "setStrokeColor", Integer.TYPE);
                    declaredMethod3.setAccessible(true);
                    declaredMethod3.invoke(objInvoke, Integer.valueOf(vectorEntry.g()));
                }
            } catch (Exception unused) {
            }
        }
        return vectorDrawableCompatA;
    }

    public static /* synthetic */ VectorDrawablePathColorHelper setPartPathColor$default(VectorDrawablePathColorHelper vectorDrawablePathColorHelper, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return vectorDrawablePathColorHelper.setPartPathColor(str, i, z);
    }

    @Nullable
    public final Drawable create() {
        if (this.tintColor == null) {
            return this.entryList.isEmpty() ? ContextCompat.getDrawable(this.context, this.vectorResId) : b();
        }
        Drawable drawable = ContextCompat.getDrawable(this.context, this.vectorResId);
        if (drawable == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(this.tintColor.intValue());
            return drawable;
        }
        DrawableCompat.setTint(drawable, this.tintColor.intValue());
        return drawable;
    }

    @NotNull
    public final VectorDrawablePathColorHelper setPartPathColor(@NotNull String path, @ColorInt int color, boolean fillColor) {
        this.entryList.add(new VectorEntry(path, color, fillColor));
        return this;
    }

    @NotNull
    public final VectorDrawablePathColorHelper setTint(@ColorInt int tint) {
        this.tintColor = Integer.valueOf(tint);
        return this;
    }
}
