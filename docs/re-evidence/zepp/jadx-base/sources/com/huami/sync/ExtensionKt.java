package com.huami.sync;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.text.ttml.b;
import com.xiaomi.hm.health.Constant;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0007\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0012\u0010\u000e\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f\u001a(\u0010\u0014\u001a\u00020\u0013*\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u001a\"\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u0016*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u001aE\u0010\u001d\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u00162*\u0010\u001c\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b0\u001a\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroid/view/View;", "", "color", "", "radius", "", "roundShape", "", "Landroid/content/Context;", Constant.PAI_KEY_DAILY_PAI, "dp2px", "Landroidx/appcompat/widget/Toolbar;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "support", "titleColor", "titleSize", "", b.k0, "Landroid/widget/TextView;", "centerTitle", "K", "V", "", "", "toJsonObject", "", "Lkotlin/Pair;", "pairs", "jsonObject", "([Lkotlin/Pair;)Ljava/lang/String;", "realtime_transmission_release"}, k = 2, mv = {1, 5, 1})
public final class ExtensionKt {
    @NotNull
    public static final TextView centerTitle(@NotNull Toolbar toolbar, int i, float f, boolean z) {
        TextView textView = new TextView(toolbar.getContext());
        textView.setTextColor(i);
        textView.setText(toolbar.getTitle());
        textView.setTextSize(2, f);
        textView.getPaint().setFakeBoldText(z);
        textView.setGravity(17);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        toolbar.addView(textView);
        toolbar.setTitle("");
        return textView;
    }

    public static /* synthetic */ TextView centerTitle$default(Toolbar toolbar, int i, float f, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -16777216;
        }
        if ((i2 & 2) != 0) {
            f = 16.0f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return centerTitle(toolbar, i, f, z);
    }

    public static final int dp2px(@NotNull Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @NotNull
    public static final <K, V> String jsonObject(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        return toJsonObject(r.mapOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    public static final void roundShape(@NotNull View view, int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        ViewCompat.setBackground(view, gradientDrawable);
    }

    public static final void support(@NotNull Toolbar toolbar, @NotNull AppCompatActivity appCompatActivity) {
        appCompatActivity.setSupportActionBar(toolbar);
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
        if (supportActionBar2 == null) {
            return;
        }
        supportActionBar2.setDisplayShowHomeEnabled(true);
    }

    @NotNull
    public static final <K, V> String toJsonObject(@NotNull Map<K, ? extends V> map) {
        return new JSONObject(map).toString();
    }

    public static final void roundShape(@NotNull View view, int i, @NotNull float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(fArr);
        ViewCompat.setBackground(view, gradientDrawable);
    }
}
