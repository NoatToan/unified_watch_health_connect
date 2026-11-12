package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.algo.bodyIndex.BodyIndexAnalysisImpl;
import com.huami.algo.bodyIndex.BodyIndexType;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.BodyIndexAlgoTestActivity;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityTestBodyIndexAlgoBinding;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/BodyIndexAlgoTestActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "getSexType", GoogleApiAvailabilityLight.b, "m", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityTestBodyIndexAlgoBinding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityTestBodyIndexAlgoBinding;", "binding", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyIndexAlgoTestActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityTestBodyIndexAlgoBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Lcom/huami/algo/bodyIndex/BodyIndexType;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Map.Entry<? extends BodyIndexType, ? extends Object>, CharSequence> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<? extends BodyIndexType, ? extends Object> entry) {
            return entry.getKey().getIndexName() + JsonLexerKt.COLON + entry.getValue() + '\n';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Lcom/huami/algo/bodyIndex/BodyIndexType;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Map.Entry<? extends BodyIndexType, ? extends Object>, CharSequence> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<? extends BodyIndexType, ? extends Object> entry) {
            return entry.getKey().getIndexName() + JsonLexerKt.COLON + entry.getValue() + '\n';
        }
    }

    private final int getSexType() {
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding = this.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding);
        return activityTestBodyIndexAlgoBinding.setRp.getCheckedRadioButtonId() == R.id.radioMale ? 1 : 0;
    }

    private final int m() {
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding = this.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding);
        return activityTestBodyIndexAlgoBinding.setAlgoVersion.getCheckedRadioButtonId() == R.id.radioEncode ? 0 : 1;
    }

    private final int n() {
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding = this.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding);
        return activityTestBodyIndexAlgoBinding.setMeasureMode.getCheckedRadioButtonId() == R.id.radioModeNormal ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BodyIndexAlgoTestActivity bodyIndexAlgoTestActivity, View view) {
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding = bodyIndexAlgoTestActivity.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding);
        float f = Float.parseFloat(activityTestBodyIndexAlgoBinding.heightValueEdittv.getText().toString());
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding2 = bodyIndexAlgoTestActivity.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding2);
        float f2 = Float.parseFloat(activityTestBodyIndexAlgoBinding2.weightValueEdittv.getText().toString());
        int sexType = bodyIndexAlgoTestActivity.getSexType();
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding3 = bodyIndexAlgoTestActivity.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding3);
        int i = Integer.parseInt(activityTestBodyIndexAlgoBinding3.ageValueEdittv.getText().toString());
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding4 = bodyIndexAlgoTestActivity.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding4);
        int i2 = Integer.parseInt(activityTestBodyIndexAlgoBinding4.impedanceEdit.getText().toString());
        int iN = bodyIndexAlgoTestActivity.n();
        int iM = bodyIndexAlgoTestActivity.m();
        BodyIndexAnalysisImpl bodyIndexAnalysisImpl = new BodyIndexAnalysisImpl();
        Map<BodyIndexType, Object> mapAnalysisBodyIndex = iM == 0 ? bodyIndexAnalysisImpl.analysisBodyIndex(f2, f, sexType, i, i2, iN) : bodyIndexAnalysisImpl.analysisBodyIndex(f2, f, sexType, i, i2, -1);
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding5 = bodyIndexAlgoTestActivity.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding5);
        activityTestBodyIndexAlgoBinding5.analysisResult.setText(CollectionsKt___CollectionsKt.joinToString$default(mapAnalysisBodyIndex.entrySet(), "", null, null, 0, null, a.a, 30, null));
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding6 = bodyIndexAlgoTestActivity.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding6);
        TextView textView = activityTestBodyIndexAlgoBinding6.analysisCompare;
        Object obj = mapAnalysisBodyIndex.get(BodyIndexType.IMPEDANCE);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
        textView.setText(CollectionsKt___CollectionsKt.joinToString$default(bodyIndexAnalysisImpl.analysisBodyIndex(f2, f, sexType, i, (int) ((Float) obj).floatValue()).entrySet(), "", null, null, 0, null, b.a, 30, null));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        BFTitleStyleKt.setTitleStyle$default(this, "算法测试", null, BaseTitleActivity.STYLE.SINGLE_BACK, ContextCompat.getColor(this, R.color.bg_weight_title_color), false, 18, null);
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBindingInflate = ActivityTestBodyIndexAlgoBinding.inflate(getLayoutInflater());
        this.binding = activityTestBodyIndexAlgoBindingInflate;
        Objects.requireNonNull(activityTestBodyIndexAlgoBindingInflate);
        setContentView(activityTestBodyIndexAlgoBindingInflate.getRoot());
        ActivityTestBodyIndexAlgoBinding activityTestBodyIndexAlgoBinding = this.binding;
        Objects.requireNonNull(activityTestBodyIndexAlgoBinding);
        activityTestBodyIndexAlgoBinding.startButton.setOnClickListener(new View.OnClickListener() { // from class: n30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BodyIndexAlgoTestActivity.o(this.a, view);
            }
        });
    }
}
