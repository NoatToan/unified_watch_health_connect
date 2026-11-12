package com.huami.phn.coach.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.huami.phn.coach.R;
import com.huami.phn.coach.ui.GlobalTitleStyle;
import com.huami.phn.coach.ui.view.PHNTrainingStatusView;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/phn/coach/ui/activity/PHNNounExplainActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/TextView;", "x", "Landroid/widget/TextView;", "tvNonExplainTitle", "y", "tvNonExplainContent", "Lcom/huami/phn/coach/ui/view/PHNTrainingStatusView;", "z", "Lcom/huami/phn/coach/ui/view/PHNTrainingStatusView;", "nounTrainingStatusView", "Landroid/widget/LinearLayout;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/widget/LinearLayout;", "includeNounExplainTrainingStatus", "<init>", "()V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNNounExplainActivity extends BaseTitleActivity {

    @NotNull
    private static final String B = "NOUN_TYPE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private LinearLayout includeNounExplainTrainingStatus;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private TextView tvNonExplainTitle;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private TextView tvNonExplainContent;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private PHNTrainingStatusView nounTrainingStatusView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/phn/coach/ui/activity/PHNNounExplainActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "nounType", "", "start", "", PHNNounExplainActivity.B, "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, int nounType) {
            context.startActivity(new Intent(context, (Class<?>) PHNNounExplainActivity.class).putExtra(PHNNounExplainActivity.B, nounType));
        }
    }

    private final void initView() {
        this.tvNonExplainTitle = (TextView) findViewById(R.id.tv_non_explain_title);
        this.tvNonExplainContent = (TextView) findViewById(R.id.tv_non_explain_content);
        this.nounTrainingStatusView = (PHNTrainingStatusView) findViewById(R.id.noun_training_status_view);
        this.includeNounExplainTrainingStatus = (LinearLayout) findViewById(R.id.include_ll_noun_explain_training_status);
    }

    private final void l() {
        Intent intent = getIntent();
        Integer numValueOf = intent == null ? null : Integer.valueOf(intent.getIntExtra(B, 0));
        int iOrdinal = NounType.FITNESS_LEVEL.ordinal();
        if (numValueOf != null && numValueOf.intValue() == iOrdinal) {
            TextView textView = this.tvNonExplainTitle;
            if (textView == null) {
                textView = null;
            }
            textView.setText(getString(R.string.phn_training_analysis_fitness_level));
            TextView textView2 = this.tvNonExplainContent;
            (textView2 != null ? textView2 : null).setText(getString(R.string.phn_training_analysis_fitness_level_desc));
            return;
        }
        int iOrdinal2 = NounType.FATIGUE_LEVEL.ordinal();
        if (numValueOf != null && numValueOf.intValue() == iOrdinal2) {
            TextView textView3 = this.tvNonExplainTitle;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(getString(R.string.phn_training_analysis_fatigue_level));
            TextView textView4 = this.tvNonExplainContent;
            (textView4 != null ? textView4 : null).setText(getString(R.string.phn_training_analysis_fatigue_level_desc));
            return;
        }
        int iOrdinal3 = NounType.PLAN_TODAY.ordinal();
        if (numValueOf != null && numValueOf.intValue() == iOrdinal3) {
            TextView textView5 = this.tvNonExplainTitle;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setText(getString(R.string.phn_plan_today));
            TextView textView6 = this.tvNonExplainContent;
            (textView6 != null ? textView6 : null).setText(getString(R.string.phn_plan_today_desc_modify));
            return;
        }
        int iOrdinal4 = NounType.ANALYSIS_STATUS.ordinal();
        if (numValueOf != null && numValueOf.intValue() == iOrdinal4) {
            PHNTrainingStatusView pHNTrainingStatusView = this.nounTrainingStatusView;
            if (pHNTrainingStatusView == null) {
                pHNTrainingStatusView = null;
            }
            pHNTrainingStatusView.setVisibility(0);
            LinearLayout linearLayout = this.includeNounExplainTrainingStatus;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
            TextView textView7 = this.tvNonExplainTitle;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setText(getString(R.string.phn_training_analysis_status));
            TextView textView8 = this.tvNonExplainContent;
            (textView8 != null ? textView8 : null).setText(getString(R.string.phn_training_analysis_status_desc_modify));
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phn_activity_noun_explain);
        GlobalTitleStyle.setUnifyTitleStyle$default(this, false, "", null, null, 12, null);
        initView();
        l();
    }
}
