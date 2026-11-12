package com.huami.devicestylepower;

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
import com.huami.tools.log.HMLog;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0004J\"\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/devicestylepower/VectorDrawableHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "vectorResId", "Landroidx/vectordrawable/graphics/drawable/VectorDrawableCompat;", "a", "tint", "setTint", "", "path", "color", "", "fullColor", "setPartPathColor", "Landroid/graphics/drawable/Drawable;", "create", "Landroid/content/Context;", "b", LogUtil.I, "", "Lcom/huami/devicestylepower/a;", "c", "Ljava/util/List;", "entryList", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "tintColor", "<init>", "(Landroid/content/Context;I)V", "deviceStylePower_release"}, k = 1, mv = {1, 5, 1})
public final class VectorDrawableHelper {

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    public VectorDrawableHelper(@NotNull Context context, @DrawableRes int i) {
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

    public static /* synthetic */ VectorDrawableHelper setPartPathColor$default(VectorDrawableHelper vectorDrawableHelper, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return vectorDrawableHelper.setPartPathColor(str, i, z);
    }

    @Nullable
    public final Drawable create() {
        if (this.tintColor != null) {
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
        if (this.entryList.isEmpty()) {
            return ContextCompat.getDrawable(this.context, this.vectorResId);
        }
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
            } catch (Exception e) {
                HMLog.error$default("VectorDrawableHelper", null, null, new a(e), 6, null);
            }
        }
        return vectorDrawableCompatA;
    }

    @NotNull
    public final VectorDrawableHelper setPartPathColor(@NotNull String path, @ColorInt int color, boolean fullColor) {
        this.entryList.add(new VectorEntry(path, color, fullColor));
        return this;
    }

    @NotNull
    public final VectorDrawableHelper setTint(@ColorInt int tint) {
        this.tintColor = Integer.valueOf(tint);
        return this;
    }
}
