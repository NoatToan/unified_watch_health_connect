package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.ResumeReasonActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/ResumeReasonActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ResumeReasonActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45376g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMCheckableRow f45377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMCheckableRow f45378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMCheckableRow f45379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMCheckableRow f45380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f45381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f45382f = "INJURY";

    public final void ca() {
        GCMCheckableRow gCMCheckableRow = this.f45377a;
        if (gCMCheckableRow == null) {
            s.m("reasonInjury");
            throw null;
        }
        gCMCheckableRow.setChecked(false);
        GCMCheckableRow gCMCheckableRow2 = this.f45378b;
        if (gCMCheckableRow2 == null) {
            s.m("reasonVacation");
            throw null;
        }
        gCMCheckableRow2.setChecked(false);
        GCMCheckableRow gCMCheckableRow3 = this.f45379c;
        if (gCMCheckableRow3 == null) {
            s.m("reasonBusy");
            throw null;
        }
        gCMCheckableRow3.setChecked(false);
        GCMCheckableRow gCMCheckableRow4 = this.f45380d;
        if (gCMCheckableRow4 != null) {
            gCMCheckableRow4.setChecked(false);
        } else {
            s.m("reasonOther");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_resume_reason);
        initActionBar(true);
        setTitle(R.string.lbl_resume_training_plan);
        View viewFindViewById = findViewById(R.id.reason_injury);
        viewFindViewById.getClass();
        this.f45377a = (GCMCheckableRow) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.reason_vacation);
        viewFindViewById2.getClass();
        this.f45378b = (GCMCheckableRow) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.reason_busy);
        viewFindViewById3.getClass();
        this.f45379c = (GCMCheckableRow) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.reason_other);
        viewFindViewById4.getClass();
        this.f45380d = (GCMCheckableRow) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.reason_send);
        viewFindViewById5.getClass();
        this.f45381e = (TextView) viewFindViewById5;
        GCMCheckableRow gCMCheckableRow = this.f45377a;
        if (gCMCheckableRow == null) {
            s.m("reasonInjury");
            throw null;
        }
        final int i14 = 0;
        gCMCheckableRow.setOnClickListener(new View.OnClickListener(this) { // from class: cu1.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeReasonActivity f55710b;

            {
                this.f55710b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                ResumeReasonActivity resumeReasonActivity = this.f55710b;
                switch (i15) {
                    case 0:
                        ResumeReasonActivity.a aVar = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow2 = resumeReasonActivity.f45377a;
                        if (gCMCheckableRow2 == null) {
                            p005kotlin.jvm.internal.s.m("reasonInjury");
                            throw null;
                        }
                        gCMCheckableRow2.setChecked(true);
                        resumeReasonActivity.f45382f = "INJURY";
                        TextView textView = resumeReasonActivity.f45381e;
                        if (textView != null) {
                            textView.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 1:
                        ResumeReasonActivity.a aVar2 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow3 = resumeReasonActivity.f45378b;
                        if (gCMCheckableRow3 == null) {
                            p005kotlin.jvm.internal.s.m("reasonVacation");
                            throw null;
                        }
                        gCMCheckableRow3.setChecked(true);
                        resumeReasonActivity.f45382f = "VACATION";
                        TextView textView2 = resumeReasonActivity.f45381e;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 2:
                        ResumeReasonActivity.a aVar3 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow4 = resumeReasonActivity.f45379c;
                        if (gCMCheckableRow4 == null) {
                            p005kotlin.jvm.internal.s.m("reasonBusy");
                            throw null;
                        }
                        gCMCheckableRow4.setChecked(true);
                        resumeReasonActivity.f45382f = "BUSY";
                        TextView textView3 = resumeReasonActivity.f45381e;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 3:
                        ResumeReasonActivity.a aVar4 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow5 = resumeReasonActivity.f45380d;
                        if (gCMCheckableRow5 == null) {
                            p005kotlin.jvm.internal.s.m("reasonOther");
                            throw null;
                        }
                        gCMCheckableRow5.setChecked(true);
                        resumeReasonActivity.f45382f = "OTHER";
                        TextView textView4 = resumeReasonActivity.f45381e;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    default:
                        ResumeReasonActivity.a aVar5 = ResumeReasonActivity.f45376g;
                        Intent intent = new Intent();
                        intent.putExtra("REASON_EXTRA", resumeReasonActivity.f45382f);
                        resumeReasonActivity.setResult(-1, intent);
                        resumeReasonActivity.finish();
                        return;
                }
            }
        });
        GCMCheckableRow gCMCheckableRow2 = this.f45378b;
        if (gCMCheckableRow2 == null) {
            s.m("reasonVacation");
            throw null;
        }
        final int i15 = 1;
        gCMCheckableRow2.setOnClickListener(new View.OnClickListener(this) { // from class: cu1.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeReasonActivity f55710b;

            {
                this.f55710b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                ResumeReasonActivity resumeReasonActivity = this.f55710b;
                switch (i16) {
                    case 0:
                        ResumeReasonActivity.a aVar = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow3 = resumeReasonActivity.f45377a;
                        if (gCMCheckableRow3 == null) {
                            p005kotlin.jvm.internal.s.m("reasonInjury");
                            throw null;
                        }
                        gCMCheckableRow3.setChecked(true);
                        resumeReasonActivity.f45382f = "INJURY";
                        TextView textView = resumeReasonActivity.f45381e;
                        if (textView != null) {
                            textView.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 1:
                        ResumeReasonActivity.a aVar2 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow4 = resumeReasonActivity.f45378b;
                        if (gCMCheckableRow4 == null) {
                            p005kotlin.jvm.internal.s.m("reasonVacation");
                            throw null;
                        }
                        gCMCheckableRow4.setChecked(true);
                        resumeReasonActivity.f45382f = "VACATION";
                        TextView textView2 = resumeReasonActivity.f45381e;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 2:
                        ResumeReasonActivity.a aVar3 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow5 = resumeReasonActivity.f45379c;
                        if (gCMCheckableRow5 == null) {
                            p005kotlin.jvm.internal.s.m("reasonBusy");
                            throw null;
                        }
                        gCMCheckableRow5.setChecked(true);
                        resumeReasonActivity.f45382f = "BUSY";
                        TextView textView3 = resumeReasonActivity.f45381e;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 3:
                        ResumeReasonActivity.a aVar4 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow6 = resumeReasonActivity.f45380d;
                        if (gCMCheckableRow6 == null) {
                            p005kotlin.jvm.internal.s.m("reasonOther");
                            throw null;
                        }
                        gCMCheckableRow6.setChecked(true);
                        resumeReasonActivity.f45382f = "OTHER";
                        TextView textView4 = resumeReasonActivity.f45381e;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    default:
                        ResumeReasonActivity.a aVar5 = ResumeReasonActivity.f45376g;
                        Intent intent = new Intent();
                        intent.putExtra("REASON_EXTRA", resumeReasonActivity.f45382f);
                        resumeReasonActivity.setResult(-1, intent);
                        resumeReasonActivity.finish();
                        return;
                }
            }
        });
        GCMCheckableRow gCMCheckableRow3 = this.f45379c;
        if (gCMCheckableRow3 == null) {
            s.m("reasonBusy");
            throw null;
        }
        final int i16 = 2;
        gCMCheckableRow3.setOnClickListener(new View.OnClickListener(this) { // from class: cu1.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeReasonActivity f55710b;

            {
                this.f55710b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                ResumeReasonActivity resumeReasonActivity = this.f55710b;
                switch (i17) {
                    case 0:
                        ResumeReasonActivity.a aVar = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow4 = resumeReasonActivity.f45377a;
                        if (gCMCheckableRow4 == null) {
                            p005kotlin.jvm.internal.s.m("reasonInjury");
                            throw null;
                        }
                        gCMCheckableRow4.setChecked(true);
                        resumeReasonActivity.f45382f = "INJURY";
                        TextView textView = resumeReasonActivity.f45381e;
                        if (textView != null) {
                            textView.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 1:
                        ResumeReasonActivity.a aVar2 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow5 = resumeReasonActivity.f45378b;
                        if (gCMCheckableRow5 == null) {
                            p005kotlin.jvm.internal.s.m("reasonVacation");
                            throw null;
                        }
                        gCMCheckableRow5.setChecked(true);
                        resumeReasonActivity.f45382f = "VACATION";
                        TextView textView2 = resumeReasonActivity.f45381e;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 2:
                        ResumeReasonActivity.a aVar3 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow6 = resumeReasonActivity.f45379c;
                        if (gCMCheckableRow6 == null) {
                            p005kotlin.jvm.internal.s.m("reasonBusy");
                            throw null;
                        }
                        gCMCheckableRow6.setChecked(true);
                        resumeReasonActivity.f45382f = "BUSY";
                        TextView textView3 = resumeReasonActivity.f45381e;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 3:
                        ResumeReasonActivity.a aVar4 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow7 = resumeReasonActivity.f45380d;
                        if (gCMCheckableRow7 == null) {
                            p005kotlin.jvm.internal.s.m("reasonOther");
                            throw null;
                        }
                        gCMCheckableRow7.setChecked(true);
                        resumeReasonActivity.f45382f = "OTHER";
                        TextView textView4 = resumeReasonActivity.f45381e;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    default:
                        ResumeReasonActivity.a aVar5 = ResumeReasonActivity.f45376g;
                        Intent intent = new Intent();
                        intent.putExtra("REASON_EXTRA", resumeReasonActivity.f45382f);
                        resumeReasonActivity.setResult(-1, intent);
                        resumeReasonActivity.finish();
                        return;
                }
            }
        });
        GCMCheckableRow gCMCheckableRow4 = this.f45380d;
        if (gCMCheckableRow4 == null) {
            s.m("reasonOther");
            throw null;
        }
        final int i17 = 3;
        gCMCheckableRow4.setOnClickListener(new View.OnClickListener(this) { // from class: cu1.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeReasonActivity f55710b;

            {
                this.f55710b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                ResumeReasonActivity resumeReasonActivity = this.f55710b;
                switch (i18) {
                    case 0:
                        ResumeReasonActivity.a aVar = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow5 = resumeReasonActivity.f45377a;
                        if (gCMCheckableRow5 == null) {
                            p005kotlin.jvm.internal.s.m("reasonInjury");
                            throw null;
                        }
                        gCMCheckableRow5.setChecked(true);
                        resumeReasonActivity.f45382f = "INJURY";
                        TextView textView = resumeReasonActivity.f45381e;
                        if (textView != null) {
                            textView.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 1:
                        ResumeReasonActivity.a aVar2 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow6 = resumeReasonActivity.f45378b;
                        if (gCMCheckableRow6 == null) {
                            p005kotlin.jvm.internal.s.m("reasonVacation");
                            throw null;
                        }
                        gCMCheckableRow6.setChecked(true);
                        resumeReasonActivity.f45382f = "VACATION";
                        TextView textView2 = resumeReasonActivity.f45381e;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 2:
                        ResumeReasonActivity.a aVar3 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow7 = resumeReasonActivity.f45379c;
                        if (gCMCheckableRow7 == null) {
                            p005kotlin.jvm.internal.s.m("reasonBusy");
                            throw null;
                        }
                        gCMCheckableRow7.setChecked(true);
                        resumeReasonActivity.f45382f = "BUSY";
                        TextView textView3 = resumeReasonActivity.f45381e;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 3:
                        ResumeReasonActivity.a aVar4 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow8 = resumeReasonActivity.f45380d;
                        if (gCMCheckableRow8 == null) {
                            p005kotlin.jvm.internal.s.m("reasonOther");
                            throw null;
                        }
                        gCMCheckableRow8.setChecked(true);
                        resumeReasonActivity.f45382f = "OTHER";
                        TextView textView4 = resumeReasonActivity.f45381e;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    default:
                        ResumeReasonActivity.a aVar5 = ResumeReasonActivity.f45376g;
                        Intent intent = new Intent();
                        intent.putExtra("REASON_EXTRA", resumeReasonActivity.f45382f);
                        resumeReasonActivity.setResult(-1, intent);
                        resumeReasonActivity.finish();
                        return;
                }
            }
        });
        TextView textView = this.f45381e;
        if (textView == null) {
            s.m("send");
            throw null;
        }
        final int i18 = 4;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: cu1.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ResumeReasonActivity f55710b;

            {
                this.f55710b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i19 = i18;
                ResumeReasonActivity resumeReasonActivity = this.f55710b;
                switch (i19) {
                    case 0:
                        ResumeReasonActivity.a aVar = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow5 = resumeReasonActivity.f45377a;
                        if (gCMCheckableRow5 == null) {
                            p005kotlin.jvm.internal.s.m("reasonInjury");
                            throw null;
                        }
                        gCMCheckableRow5.setChecked(true);
                        resumeReasonActivity.f45382f = "INJURY";
                        TextView textView2 = resumeReasonActivity.f45381e;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 1:
                        ResumeReasonActivity.a aVar2 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow6 = resumeReasonActivity.f45378b;
                        if (gCMCheckableRow6 == null) {
                            p005kotlin.jvm.internal.s.m("reasonVacation");
                            throw null;
                        }
                        gCMCheckableRow6.setChecked(true);
                        resumeReasonActivity.f45382f = "VACATION";
                        TextView textView3 = resumeReasonActivity.f45381e;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 2:
                        ResumeReasonActivity.a aVar3 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow7 = resumeReasonActivity.f45379c;
                        if (gCMCheckableRow7 == null) {
                            p005kotlin.jvm.internal.s.m("reasonBusy");
                            throw null;
                        }
                        gCMCheckableRow7.setChecked(true);
                        resumeReasonActivity.f45382f = "BUSY";
                        TextView textView4 = resumeReasonActivity.f45381e;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    case 3:
                        ResumeReasonActivity.a aVar4 = ResumeReasonActivity.f45376g;
                        resumeReasonActivity.ca();
                        GCMCheckableRow gCMCheckableRow8 = resumeReasonActivity.f45380d;
                        if (gCMCheckableRow8 == null) {
                            p005kotlin.jvm.internal.s.m("reasonOther");
                            throw null;
                        }
                        gCMCheckableRow8.setChecked(true);
                        resumeReasonActivity.f45382f = "OTHER";
                        TextView textView5 = resumeReasonActivity.f45381e;
                        if (textView5 != null) {
                            textView5.setVisibility(0);
                            return;
                        } else {
                            p005kotlin.jvm.internal.s.m("send");
                            throw null;
                        }
                    default:
                        ResumeReasonActivity.a aVar5 = ResumeReasonActivity.f45376g;
                        Intent intent = new Intent();
                        intent.putExtra("REASON_EXTRA", resumeReasonActivity.f45382f);
                        resumeReasonActivity.setResult(-1, intent);
                        resumeReasonActivity.finish();
                        return;
                }
            }
        });
        ca();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/ResumeReasonActivity$a;", "", "<init>", "()V", "", "REASON_EXTRA", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
