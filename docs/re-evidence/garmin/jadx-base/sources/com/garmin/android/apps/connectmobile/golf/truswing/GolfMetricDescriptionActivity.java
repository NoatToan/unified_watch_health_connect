package com.garmin.android.apps.connectmobile.golf.truswing;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class GolfMetricDescriptionActivity extends com.garmin.android.apps.connectmobile.c {

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view2) {
            int i14 = GolfMetricBallFlightActivity.f35772a;
            GolfMetricDescriptionActivity golfMetricDescriptionActivity = GolfMetricDescriptionActivity.this;
            golfMetricDescriptionActivity.startActivity(new Intent(golfMetricDescriptionActivity, (Class<?>) GolfMetricBallFlightActivity.class));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.garmin.android.apps.connectmobile.golf.truswing.model.c cVar;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_golf_metric_description);
        initActionBar(true, R.string.golf_swing_metric_description_title);
        int intExtra = getIntent().getIntExtra("METRIC_TYPE", -1);
        if (intExtra == -1) {
            i2.a(a2.GOLF, "GolfMetricDescriptionActivity", " Missing METRIC_TYPE");
            finish();
        }
        TextView textView = (TextView) findViewById(R.id.golf_metric_name);
        TextView textView2 = (TextView) findViewById(R.id.golf_metric_description);
        ImageView imageView = (ImageView) findViewById(R.id.golf_metric_description_image);
        com.garmin.android.apps.connectmobile.golf.truswing.model.c[] cVarArrValues = com.garmin.android.apps.connectmobile.golf.truswing.model.c.values();
        int length = cVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i14];
            if (cVar.ordinal() == intExtra) {
                break;
            } else {
                i14++;
            }
        }
        if (cVar != null) {
            int i15 = cVar.f35916c;
            textView.setText(cVar.f35915b);
            imageView.setBackgroundResource(cVar.f35914a);
            if (!com.garmin.android.apps.connectmobile.golf.truswing.model.c.CLUB_PATH_AT_IMPACT.equals(cVar) && !com.garmin.android.apps.connectmobile.golf.truswing.model.c.FACE_ANGLE_TO_TARGET.equals(cVar)) {
                textView2.setText(i15);
                return;
            }
            String string = getString(i15);
            String string2 = getString(R.string.golf_club_path_ball_flights_clickable_text);
            String[] strArrSplit = string.split("%1\\$s");
            i2.f(a2.GOLF, "GolfMetricDescriptionActivity", "description does not contain the placeholder %1$s!");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strArrSplit[0]);
            a aVar = new a();
            for (int i16 = 1; i16 < strArrSplit.length; i16++) {
                spannableStringBuilder.append((CharSequence) string2);
                spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - string2.length(), spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) strArrSplit[i16]);
            }
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
    }
}
