package com.huami.healthlabel.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.healthlabel.R;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.IconToast;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\b\u0010\b\u001a\u00020\u0004H\u0000\u001a\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0000H\u0000\u001a\b\u0010\r\u001a\u00020\fH\u0000\u001a\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0000H\u0000\u001a\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0000H\u0000\u001a\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\"\u001d\u0010\u0019\u001a\u00020\u00148F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "screenWidth", "screenHeight", "getNavigationBarHeight", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isNetworkConnect", "getGlobalContext", "strId", "", "toast", "", "getTimeSecond", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "icon", "Landroid/graphics/Bitmap;", "obtainBitmap", "obtainSvgBitmap", "isDarkMode", "Lkotlinx/serialization/json/Json;", "a", "Lkotlin/Lazy;", "getJson", "()Lkotlinx/serialization/json/Json;", "json", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/Json;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Json> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.healthlabel.utils.UtilsKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0437a extends Lambda implements Function1<JsonBuilder, Unit> {
            public static final C0437a a = new C0437a();

            public C0437a() {
                super(1);
            }

            public final void a(@NotNull JsonBuilder jsonBuilder) {
                jsonBuilder.setLenient(true);
                jsonBuilder.setIgnoreUnknownKeys(true);
                jsonBuilder.setAllowSpecialFloatingPointValues(true);
                jsonBuilder.setUseArrayPolymorphism(true);
                jsonBuilder.setEncodeDefaults(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                a(jsonBuilder);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Json invoke() {
            return JsonKt.Json$default(null, C0437a.a, 1, null);
        }
    }

    @NotNull
    public static final Context getGlobalContext() {
        return (Context) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
    }

    @NotNull
    public static final Json getJson() {
        return (Json) a.getValue();
    }

    public static final int getNavigationBarHeight() {
        if (Resources.getSystem().getIdentifier("config_showNavigationBar", "bool", "android") == 0) {
            return 0;
        }
        return Resources.getSystem().getDimensionPixelSize(Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static final long getTimeSecond() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    public static final boolean isDarkMode(@NotNull Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isNetworkConnect(@NotNull Context context) {
        NetworkInfo activeNetworkInfo;
        Object systemService = context.getSystemService("connectivity");
        return systemService != null && (systemService instanceof ConnectivityManager) && (activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected();
    }

    @NotNull
    public static final Bitmap obtainBitmap(@NotNull Context context, int i, @DrawableRes int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i2, options);
        options.inJustDecodeBounds = false;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i;
        return BitmapFactory.decodeResource(context.getResources(), i2, options);
    }

    @NotNull
    public static final Bitmap obtainSvgBitmap(@NotNull Context context, @DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.VectorDrawable");
        VectorDrawable vectorDrawable = (VectorDrawable) drawable;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        vectorDrawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static final int screenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int screenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static final void toast(@StringRes int i) {
        IconToast.showToast(getGlobalContext(), R.drawable.ic_health_label_warning_toast, i, 0);
    }
}
