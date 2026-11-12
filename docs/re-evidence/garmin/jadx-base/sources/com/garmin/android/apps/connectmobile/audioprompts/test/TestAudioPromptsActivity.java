package com.garmin.android.apps.connectmobile.audioprompts.test;

import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.audioprompts.test.TestAudioPromptsActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.proto.generated.GDIAudioPromptsProto;
import com.garmin.proto.generated.GDISmartProto;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/test/TestAudioPromptsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClickSpeak", "(Landroid/view/View;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TestAudioPromptsActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f30228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f30229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mu.b f30230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mu.b f30231e;

    /* JADX WARN: Type inference failed for: r0v0, types: [mu.b] */
    /* JADX WARN: Type inference failed for: r0v1, types: [mu.b] */
    public TestAudioPromptsActivity() {
        final int i14 = 0;
        this.f30230d = new Runnable(this) { // from class: mu.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestAudioPromptsActivity f121083b;

            {
                this.f121083b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        Button button = this.f121083b.f30228b;
                        button.getClass();
                        button.setVisibility(4);
                        break;
                    default:
                        Button button2 = this.f121083b.f30228b;
                        button2.getClass();
                        button2.setVisibility(0);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f30231e = new Runnable(this) { // from class: mu.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestAudioPromptsActivity f121083b;

            {
                this.f121083b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        Button button = this.f121083b.f30228b;
                        button.getClass();
                        button.setVisibility(4);
                        break;
                    default:
                        Button button2 = this.f121083b.f30228b;
                        button2.getClass();
                        button2.setVisibility(0);
                        break;
                }
            }
        };
    }

    public final void ca(a aVar, CharSequence charSequence, boolean z14) {
        String string = charSequence.toString();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.frag_container, aVar, string);
        aVar2.e();
        this.f30227a = string;
        setTitle(string);
        Button button = this.f30228b;
        button.getClass();
        button.setVisibility(z14 ? 0 : 8);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    public final void onClickSpeak(View v14) {
        Fragment fragmentG;
        GDIAudioPromptsProto.AudioPromptsService.Builder builderU6;
        if (this.f30227a == null || (fragmentG = getSupportFragmentManager().G(this.f30227a)) == null || (builderU6 = ((a) fragmentG).u6()) == null) {
            return;
        }
        Handler handler = this.f30229c;
        handler.getClass();
        handler.post(this.f30230d);
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        ProtoUtil.Companion companion = ProtoUtil.INSTANCE;
        builderNewBuilder.getClass();
        companion.setAudioPromptsService(builderNewBuilder, builderU6);
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        smartBuild.getClass();
        new ju.a().onProtobufRequest(smartBuild, new mu.a());
        Handler handler2 = this.f30229c;
        handler2.getClass();
        handler2.postDelayed(this.f30231e, 3000L);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVolumeControlStream(3);
        this.f30229c = new Handler();
        setContentView(R.layout.activity_test_audio_prompts);
        this.f30228b = (Button) findViewById(R.id.bttn_speak);
        initActionBar(true, "Test Audio Prompts");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.test_audio_prompts_menu, menu);
        return true;
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f30229c;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        finish();
        return super.onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        CharSequence title = menuItem.getTitle();
        if (title == null) {
            title = "";
        }
        String str = this.f30227a;
        if (str != null && u.m(str, title)) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_supported_languages) {
            ca(new b(), title, false);
            return true;
        }
        if (itemId == R.id.menu_item_lap) {
            ca(new mu.e(), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_heart_rate_bpm) {
            ca(new mu.c(), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_heart_rate_zone) {
            ca(new mu.d(), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_heart_rate_percent_max) {
            c.f30233c.getClass();
            Bundle bundle = new Bundle(1);
            bundle.putInt(NotificationConstants.KEY_DATA_MIME_TYPE, 1);
            c cVar = new c();
            cVar.setArguments(bundle);
            ca(cVar, title, true);
            return true;
        }
        if (itemId == R.id.menu_item_heart_rate_percent_reserve) {
            c.f30233c.getClass();
            Bundle bundle2 = new Bundle(1);
            bundle2.putInt(NotificationConstants.KEY_DATA_MIME_TYPE, 2);
            c cVar2 = new c();
            cVar2.setArguments(bundle2);
            ca(cVar2, title, true);
            return true;
        }
        if (itemId == R.id.menu_item_pace_average) {
            d.f30236d.getClass();
            ca(d.a.a(1), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_pace_current) {
            d.f30236d.getClass();
            ca(d.a.a(2), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_pace_lap) {
            d.f30236d.getClass();
            ca(d.a.a(3), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_speed_average) {
            f.f30243j.getClass();
            ca(f.a.a(1), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_speed_current) {
            f.f30243j.getClass();
            ca(f.a.a(2), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_speed_lap) {
            f.f30243j.getClass();
            ca(f.a.a(3), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_power_average) {
            e.f30240c.getClass();
            ca(e.a.a(1), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_power_normalized) {
            e.f30240c.getClass();
            ca(e.a.a(2), title, true);
            return true;
        }
        if (itemId == R.id.menu_item_power_lap) {
            e.f30240c.getClass();
            ca(e.a.a(3), title, true);
            return true;
        }
        if (itemId != R.id.menu_item_phrase) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca(new mu.f(), title, true);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        if (this.f30227a == null) {
            return true;
        }
        int size = menu.size();
        for (int i14 = 0; i14 < size; i14++) {
            MenuItem item = menu.getItem(i14);
            item.getClass();
            item.setChecked(s.g(item.getTitle(), this.f30227a));
        }
        return true;
    }
}
