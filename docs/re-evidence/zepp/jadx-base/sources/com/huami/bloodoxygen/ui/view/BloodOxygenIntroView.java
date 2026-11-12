package com.huami.bloodoxygen.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.bloodoxygen.core.koin.BloodOxygenKoinScopeKt;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.activity.Spo2IntroDetailActivity;
import com.huami.bloodoxygen.ui.view.BloodOxygenIntroView;
import com.huami.bloodoxygen.ui.vo.DetailUIConfig;
import com.huami.tools.analytics.DbUtils;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodoxygen/ui/view/BloodOxygenIntroView;", "Landroid/widget/RelativeLayout;", "Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "a", "Lkotlin/Lazy;", "getDetailUIConfig", "()Lcom/huami/bloodoxygen/ui/vo/DetailUIConfig;", "detailUIConfig", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenIntroView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy detailUIConfig;

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

    @JvmOverloads
    public BloodOxygenIntroView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public BloodOxygenIntroView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BloodOxygenIntroView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, View view) {
        Spo2IntroDetailActivity.INSTANCE.launch(context);
    }

    private final DetailUIConfig getDetailUIConfig() {
        return (DetailUIConfig) this.detailUIConfig.getValue();
    }

    @JvmOverloads
    public BloodOxygenIntroView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.detailUIConfig = LazyKt__LazyJVMKt.lazy(a.a);
        RelativeLayout.inflate(getContext(), R.layout.bo_ui_detail_intro, this);
        ((LinearLayout) findViewById(R.id.read_more)).setOnClickListener(new View.OnClickListener() { // from class: cz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodOxygenIntroView.b(context, view);
            }
        });
        ((TextView) findViewById(R.id.jp_hint_text)).setVisibility((getDetailUIConfig().getShowJapaneseHint() && (Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE) || Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.JAPANESE.getLanguage()))) ? 0 : 8);
    }
}
