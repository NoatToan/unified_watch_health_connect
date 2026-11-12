package com.garmin.android.apps.connectmobile.connections.groups.challenges;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.Toast;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.s;
import dh.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import jm0.e;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public class GroupChallengeRulesActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupChallengeDTO f31370a;

    public static void ca(Context context, GroupChallengeDTO groupChallengeDTO, int i14) {
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) GroupChallengeRulesActivity.class);
            intent.putExtra("GCM_extra_group_challenge", groupChallengeDTO);
            intent.putExtra("view_action", i14);
            context.startActivity(intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Date date;
        Date date2;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_group_challenges_upcoming_rules_3_0);
        this.f31370a = (GroupChallengeDTO) getIntent().getParcelableExtra("GCM_extra_group_challenge");
        int i14 = getIntent().getExtras().getInt("view_action");
        if (this.f31370a == null) {
            Toast.makeText(this, R.string.txt_error_occurred, 1).show();
            finish();
        }
        if (i14 == 1) {
            super.initActionBar(true, getString(R.string.lbl_challenge_details));
        } else if (i14 == 2) {
            super.initActionBar(true, getString(R.string.lbl_details));
        }
        TextView textView = (TextView) findViewById(R.id.challenge_name);
        TextView textView2 = (TextView) findViewById(R.id.challenge_start);
        TextView textView3 = (TextView) findViewById(R.id.challenge_end);
        TextView textView4 = (TextView) findViewById(R.id.challenge_description);
        TextView textView5 = (TextView) findViewById(R.id.challenge_rules);
        textView.setText(this.f31370a.f31516e);
        GroupChallengeDTO groupChallengeDTO = this.f31370a;
        String str = groupChallengeDTO.f31520i;
        String str2 = groupChallengeDTO.f31521j;
        e.f99565a.getClass();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse(str);
        } catch (ParseException unused) {
            date = null;
        }
        String strB = date != null ? j0.b(new DateTime(date.getTime()), "yyyy/M/d", null) : null;
        e.f99565a.getClass();
        try {
            date2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").parse(str2);
        } catch (ParseException unused2) {
            date2 = null;
        }
        String strB2 = date2 != null ? j0.b(new DateTime(date2.getTime()), "yyyy/M/d", null) : null;
        GroupChallengeDTO.b bVar = this.f31370a.f31513b;
        if (bVar == GroupChallengeDTO.b.UPCOMING) {
            textView2.setText(getString(R.string.lbl_starts, strB));
            textView3.setText(getString(R.string.lbl_group_challenge_ends, strB2));
        } else if (bVar == GroupChallengeDTO.b.IN_PROGRESS) {
            textView2.setText(getString(R.string.lbl_started, strB));
            textView3.setText(getString(R.string.lbl_group_challenge_ends, strB2));
        } else if (bVar == GroupChallengeDTO.b.STOPPED || bVar == GroupChallengeDTO.b.LOCKED || bVar == GroupChallengeDTO.b.COMPLETED) {
            textView2.setText(getString(R.string.lbl_started, strB));
            textView3.setText(getString(R.string.lbl_group_challenge_ended, strB2));
        }
        String str3 = this.f31370a.f31517f;
        if (!TextUtils.isEmpty(str3)) {
            textView4.setVisibility(0);
            textView4.setText(str3);
        }
        s sVar = this.f31370a.f31514c;
        if (sVar == null) {
            textView5.setVisibility(8);
            return;
        }
        String strA = b.A(this, sVar.f38320b);
        textView5.setVisibility(0);
        textView5.setText(getString(R.string.msg_group_challenge_rules_activity, strA));
    }
}
