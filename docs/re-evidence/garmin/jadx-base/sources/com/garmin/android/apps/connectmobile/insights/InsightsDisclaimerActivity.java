package com.garmin.android.apps.connectmobile.insights;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.insights.InsightsDisclaimerActivity;
import com.garmin.android.apps.connectmobile.insights.presentation.InsightsActivity;
import com.garmin.android.apps.connectmobile.r0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ro0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/insights/InsightsDisclaimerActivity;", "Lcom/garmin/android/apps/connectmobile/r0;", "<init>", "()V", "a", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InsightsDisclaimerActivity extends r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f36901f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36902e = 1;

    @Override // com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        if (this.f36902e == 1) {
            return "INSIGHTS";
        }
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_insights_disclaimer);
        initActionBar(true, getString(R.string.title_insights_disclaimer));
        if (getIntent().getExtras() != null && (extras = getIntent().getExtras()) != null) {
            this.f36902e = extras.getInt("extra_insights_redirect");
        }
        if (this.f36902e == 1) {
            ca("INSIGHTS");
        }
        TextView textView = (TextView) findViewById(R.id.insights_disclaimer_i_understand);
        TextView textView2 = (TextView) findViewById(R.id.insights_disclaimer_read_more);
        final int i14 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: mq0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsDisclaimerActivity f120213b;

            {
                this.f120213b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                InsightsDisclaimerActivity insightsDisclaimerActivity = this.f120213b;
                switch (i15) {
                    case 0:
                        InsightsDisclaimerActivity.a aVar = InsightsDisclaimerActivity.f36901f;
                        c.f120214a.getClass();
                        c.a(insightsDisclaimerActivity).edit().putBoolean(insightsDisclaimerActivity.getString(R.string.key_insights_disclaimer_agreed), true).apply();
                        if (insightsDisclaimerActivity.f36902e == 1) {
                            InsightsActivity.f36903f.getClass();
                            insightsDisclaimerActivity.startActivity(new Intent(insightsDisclaimerActivity, (Class<?>) InsightsActivity.class));
                            insightsDisclaimerActivity.finish();
                        }
                        break;
                    default:
                        InsightsDisclaimerActivity.a aVar2 = InsightsDisclaimerActivity.f36901f;
                        HelpActivity.a aVar3 = HelpActivity.f36653a;
                        l lVar = l.INSIGHTS;
                        aVar3.getClass();
                        HelpActivity.a.d(insightsDisclaimerActivity, lVar, null, null);
                        break;
                }
            }
        });
        final int i15 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: mq0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsDisclaimerActivity f120213b;

            {
                this.f120213b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                InsightsDisclaimerActivity insightsDisclaimerActivity = this.f120213b;
                switch (i16) {
                    case 0:
                        InsightsDisclaimerActivity.a aVar = InsightsDisclaimerActivity.f36901f;
                        c.f120214a.getClass();
                        c.a(insightsDisclaimerActivity).edit().putBoolean(insightsDisclaimerActivity.getString(R.string.key_insights_disclaimer_agreed), true).apply();
                        if (insightsDisclaimerActivity.f36902e == 1) {
                            InsightsActivity.f36903f.getClass();
                            insightsDisclaimerActivity.startActivity(new Intent(insightsDisclaimerActivity, (Class<?>) InsightsActivity.class));
                            insightsDisclaimerActivity.finish();
                        }
                        break;
                    default:
                        InsightsDisclaimerActivity.a aVar2 = InsightsDisclaimerActivity.f36901f;
                        HelpActivity.a aVar3 = HelpActivity.f36653a;
                        l lVar = l.INSIGHTS;
                        aVar3.getClass();
                        HelpActivity.a.d(insightsDisclaimerActivity, lVar, null, null);
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/insights/InsightsDisclaimerActivity$a;", "", "<init>", "()V", "", "INSIGHT_REDIRECT_EXTRA", "Ljava/lang/String;", "", "INSIGHTS_HOME_SCREEN", "I", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
