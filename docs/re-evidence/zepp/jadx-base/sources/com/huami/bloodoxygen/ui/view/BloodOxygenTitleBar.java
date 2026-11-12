package com.huami.bloodoxygen.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.vo.DetailUIConfig;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/huami/bloodoxygen/ui/view/BloodOxygenTitleBar;", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "x", "Lkotlin/Lazy;", "getConfig", "()Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "config", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenTitleBar extends RainbowTitleBar {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy config;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DetailUIConfig> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DetailUIConfig invoke() {
            return (DetailUIConfig) BloodOxygenKoinScopeKt.getBloodOxygenKoinScope().get(Reflection.getOrCreateKotlinClass(DetailUIConfig.class), null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BloodOxygenTitleBar(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BloodOxygenTitleBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final DetailUIConfig getConfig() {
        return (DetailUIConfig) this.config.getValue();
    }

    @JvmOverloads
    public BloodOxygenTitleBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.config = LazyKt__LazyJVMKt.lazy(a.a);
        LinearLayout.inflate(getContext(), R.layout.rainbow_layout_titlebar, this);
        if (getConfig().isMifitStyle()) {
            setBackgroundColor(getConfig().getMifitThemeColor());
            int color = ContextCompat.getColor(getContext(), R.color.s5);
            setNavigationIcon(R.drawable.ic_arrow_back_20_2x);
            ImageViewCompat.setImageTintList((ImageView) findViewById(com.huami.lib.rainbow.R.id.rainbow_navigation_icon), ColorStateList.valueOf(color));
            setTitleTextColor(color);
        }
        TextView textView = (TextView) findViewById(R.id.rainbow_title);
        textView.setSingleLine(false);
        textView.setMaxLines(2);
    }
}
