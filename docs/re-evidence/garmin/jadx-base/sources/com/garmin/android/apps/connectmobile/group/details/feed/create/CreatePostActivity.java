package com.garmin.android.apps.connectmobile.group.details.feed.create;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import tm0.i;
import v22.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/feed/create/CreatePostActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreatePostActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36357a = new a(null);

    public final void ca(Bundle bundle, Class cls, String str) {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.container, aVarB.g(bundle, cls), str, 1);
        aVarB.d(str);
        aVarB.e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                EditText editText = (EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    e.b(currentFocus);
                    editText.clearFocus();
                    View rootView = editText.getRootView();
                    if (rootView != null) {
                        rootView.requestFocus();
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> listF = getSupportFragmentManager().f7372c.f();
        ArrayList arrayListL = j.l(listF);
        for (Object obj : listF) {
            if (obj instanceof i) {
                arrayListL.add(obj);
            }
        }
        if (arrayListL.isEmpty()) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().Z();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if ((extras != null ? Long.valueOf(extras.getLong("GCM_extra_connection_group_id")) : null) != null) {
            setContentView(R.layout.activity_group_create_post);
            initActionBar(true);
            getSupportFragmentManager().b(new dv.i(this, 3));
            ca(getIntent().getExtras(), tm0.c.class, "CreatePostFragment");
            return;
        }
        setResult(0);
        finish();
        overridePendingTransition(0, R.anim.exit_out_down);
        a2 a2Var = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "CreatePostActivity", "Can not create post without a valid group id");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/feed/create/CreatePostActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_PHOTO_LIMIT", "I", "KEY_NEWS_POST_DTO", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
