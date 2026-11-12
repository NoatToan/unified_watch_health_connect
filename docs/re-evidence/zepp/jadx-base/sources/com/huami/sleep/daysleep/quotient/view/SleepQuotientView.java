package com.huami.sleep.daysleep.quotient.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.daysleep.quotient.adapter.SleepQuotientAdapter;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.view.UnitTextView;
import com.huami.tools.analytics.DbUtils;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\u000b\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007R\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/view/SleepQuotientView;", "Landroid/widget/FrameLayout;", "", "a", "", "titleRes", "setSleepScoreTitle", "Lkotlin/Pair;", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "quotients", "setValue", "Lcom/huami/sleep/daysleep/quotient/adapter/SleepQuotientAdapter;", "Lkotlin/Lazy;", "getQuotientAdapter", "()Lcom/huami/sleep/daysleep/quotient/adapter/SleepQuotientAdapter;", "quotientAdapter", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepQuotientView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy quotientAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/daysleep/quotient/adapter/SleepQuotientAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SleepQuotientAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepQuotientAdapter invoke() {
            return new SleepQuotientAdapter(SleepQuotientView.this.getContext());
        }
    }

    public /* synthetic */ SleepQuotientView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void a() {
        ((UnitTextView) findViewById(R.id.sleep_score)).setUnitSpace((int) ViewExKt.dp2px(this, 5.0f));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.setAdapter(getQuotientAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setNestedScrollingEnabled(false);
    }

    private final SleepQuotientAdapter getQuotientAdapter() {
        return (SleepQuotientAdapter) this.quotientAdapter.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void setSleepScoreTitle(int titleRes) {
        ((TextView) findViewById(R.id.sleep_score_desc)).setText(titleRes);
    }

    public final void setValue(@NotNull Pair<Integer, ? extends List<SleepQuotientParam>> quotients) {
        String[] strArr = new String[2];
        strArr[0] = quotients.getFirst().intValue() == 0 ? "--" : String.valueOf(quotients.getFirst().intValue());
        strArr[1] = getContext().getResources().getQuantityString(R.plurals.sleep_score_unit, quotients.getFirst().intValue());
        ((UnitTextView) findViewById(R.id.sleep_score)).setValues((String[]) Arrays.copyOf(strArr, 2));
        getQuotientAdapter().setNewData(quotients.getSecond());
    }

    public SleepQuotientView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.quotientAdapter = LazyKt__LazyJVMKt.lazy(new a());
        FrameLayout.inflate(context, R.layout.layout_sleep_quotient, this);
        a();
    }
}
