package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicex.R;
import com.huami.feedback.api.FeedbackService;
import com.huami.feedback.util.AnalyticsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.discovery.WebHelper;
import java.util.ArrayList;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceHelperActivity extends BaseTitleActivity {
    private static final String C = "Entrance_Help";
    public static final int HELPER_BIND_WIFI = 7;
    public static final int HELPER_BLUE_MONKEY = 5;
    public static final int HELPER_CHAOHU = 4;
    public static final int HELPER_HEADSET = 6;
    public static final int HELPER_MILI = 0;
    public static final int HELPER_NORMANDY = 3;
    public static final int HELPER_SET_WIFI = 8;
    public static final int HELPER_SHOES = 2;
    public static final String HELPER_SHOW_REASON_KEY = "reason";
    public static final String HELPER_TYPE_KEY = "type";
    public static final int HELPER_WEIGHT = 1;
    public static final int REASON_BIND_FAIL = 2;
    public static final int REASON_BIND_WIFI_FAIL = 3;
    public static final int REASON_CONN_FAIL = 1;
    public static final int REASON_INVALID = -1;
    public static final int REASON_SYNC_FAIL = 0;
    private String A;
    private int x = 0;
    private int y = -1;
    private ArrayList<b> z = new ArrayList<>();
    private Lazy<FeedbackService> B = KoinJavaComponent.inject(FeedbackService.class);

    public class a extends RecyclerView.Adapter<C0794a> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.HMDeviceHelperActivity$a$a, reason: collision with other inner class name */
        public class C0794a extends RecyclerView.ViewHolder {
            public TextView a;
            public TextView b;
            public View c;

            public C0794a(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.device_helper_title);
                this.b = (TextView) view.findViewById(R.id.device_helper_tips);
                this.c = view.findViewById(R.id.divider);
            }
        }

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C0794a c0794a, int i) {
            b bVar = (b) HMDeviceHelperActivity.this.z.get(i);
            c0794a.a.setText(bVar.a);
            c0794a.b.setText(bVar.b);
            if (i == HMDeviceHelperActivity.this.z.size() - 1) {
                c0794a.c.setVisibility(8);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0794a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new C0794a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_device_helper_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return HMDeviceHelperActivity.this.z.size();
        }
    }

    public static class b {
        public String a;
        public String b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        AnalyticsKt.feedbackFrom("Entrance_Help");
        this.B.getValue().feedback(null, this, getSupportFragmentManager(), null);
    }

    private void initData() {
        int i = 0;
        switch (this.x) {
            case 0:
                this.A = getString(R.string.mili_device_help);
                String[] stringArray = getResources().getStringArray(R.array.mili_help_title);
                String[] stringArray2 = getResources().getStringArray(R.array.mili_help_tips);
                if (stringArray2[0].contains("%1$s")) {
                    stringArray2[0] = String.format(stringArray2[0], getString(R.string.mili_setting_mili), getString(R.string.mili_setting_mili_1s));
                }
                for (int i2 = 1; i2 < stringArray.length; i2++) {
                    b bVar = new b();
                    bVar.a = stringArray[i2];
                    bVar.b = stringArray2[i2];
                    this.z.add(bVar);
                }
                break;
            case 1:
                this.A = getString(R.string.weight_bfs_device_help);
                String[] stringArray3 = getResources().getStringArray(R.array.weight_bfs_help_title);
                String[] stringArray4 = getResources().getStringArray(R.array.weight_bfs_help_tips);
                while (i < stringArray3.length) {
                    b bVar2 = new b();
                    bVar2.a = stringArray3[i];
                    bVar2.b = stringArray4[i];
                    this.z.add(bVar2);
                    i++;
                }
                break;
            case 2:
            case 3:
                this.A = getString(R.string.shoes_device_help, new Object[]{getString(R.string.chip_device_name)});
                String[] stringArray5 = getResources().getStringArray(R.array.shoes_help_title);
                for (int i3 = 0; i3 < 3; i3++) {
                    stringArray5[i3] = String.format(stringArray5[i3], getString(R.string.chip_device_name));
                }
                String[] stringArray6 = getResources().getStringArray(R.array.shoes_help_tips);
                for (int i4 = 0; i4 < 4; i4++) {
                    if (i4 == 0) {
                        String str = stringArray6[0];
                        int i5 = R.string.chip_device_name;
                        stringArray6[0] = String.format(str, getString(i5), getString(i5));
                    } else if (i4 == 1 || i4 == 3) {
                        stringArray6[i4] = String.format(stringArray6[i4], getString(R.string.chip_device_name));
                    }
                }
                if (this.x == 3) {
                    int i6 = R.string.normandy_help_tips;
                    int i7 = R.string.chip_device_name;
                    stringArray6[1] = getString(i6, new Object[]{getString(i7), getString(i7)});
                }
                while (i < stringArray5.length) {
                    b bVar3 = new b();
                    bVar3.a = stringArray5[i];
                    bVar3.b = stringArray6[i];
                    this.z.add(bVar3);
                    i++;
                }
                break;
            case 4:
                this.A = getString(R.string.chaohu_device_help);
                String[] stringArray7 = getResources().getStringArray(R.array.chaohu_help_title);
                String[] stringArray8 = getResources().getStringArray(R.array.chaohu_help_tips);
                if (stringArray7.length == 6 && stringArray8.length == 6) {
                    String[] strArr = {stringArray7[0], stringArray7[1], stringArray7[2], stringArray7[3], stringArray7[4]};
                    stringArray8 = new String[]{stringArray8[0], stringArray8[1], stringArray8[2], stringArray8[3], stringArray8[4]};
                    stringArray7 = strArr;
                }
                while (i < stringArray7.length) {
                    b bVar4 = new b();
                    bVar4.a = stringArray7[i];
                    bVar4.b = stringArray8[i];
                    this.z.add(bVar4);
                    i++;
                }
                break;
            case 5:
                this.A = getString(R.string.blue_monkey_helper_title);
                String[] stringArray9 = getResources().getStringArray(R.array.blue_monkey_titles);
                String[] stringArray10 = getResources().getStringArray(R.array.blue_monkey_tips);
                while (i < stringArray9.length) {
                    b bVar5 = new b();
                    bVar5.a = stringArray9[i];
                    bVar5.b = stringArray10[i];
                    this.z.add(bVar5);
                    i++;
                }
                break;
            case 7:
                this.A = getString(R.string.help);
                String[] stringArray11 = getResources().getStringArray(R.array.weight_bfs_wifi_help_title);
                String[] stringArray12 = getResources().getStringArray(R.array.weight_bfs_wifi_help_tips);
                while (i < stringArray11.length) {
                    b bVar6 = new b();
                    bVar6.a = stringArray11[i];
                    bVar6.b = stringArray12[i];
                    this.z.add(bVar6);
                    i++;
                }
                break;
            case 8:
                this.A = getString(R.string.help);
                String[] stringArray13 = getResources().getStringArray(R.array.weight_bfs_wifi_set_help_title);
                String[] stringArray14 = getResources().getStringArray(R.array.weight_bfs_wifi_set_help_tips);
                while (i < stringArray13.length) {
                    b bVar7 = new b();
                    bVar7.a = stringArray13[i];
                    bVar7.b = stringArray14[i];
                    this.z.add(bVar7);
                    i++;
                }
                break;
        }
    }

    private void n() {
        int i = this.y;
        if (i == -1) {
            return;
        }
        int i2 = this.x;
        if (i2 == 0 || i2 == 4) {
            String str = null;
            if (i == 0) {
                str = StatEvent.VALUE_SYNC_FAIL;
            } else if (i == 1) {
                str = StatEvent.VALUE_CONNECTION_FAIL;
            } else if (i == 2) {
                str = StatEvent.VALUE_BIND_FAIL;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Analytics.event(this, this.x == 0 ? StatEvent.EVENT_HELP_BAND_NUM : StatEvent.EVENT_HELP_WATCH_NUM, str);
        }
    }

    public static void show(Context context, int i, int i2) {
        if (i == 6) {
            WebHelper.launch(H5UrlSource.INSTANCE.getHeadsetHelpUrl(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.HEADSET)));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) HMDeviceHelperActivity.class);
        intent.putExtra("type", i);
        intent.putExtra("reason", i2);
        context.startActivity(intent);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x = getIntent().getIntExtra("type", 0);
        this.y = getIntent().getIntExtra("reason", -1);
        n();
        setContentView(R.layout.activity_device_helper);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.device_helper_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new a());
        initData();
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s10), true);
        setTitleText(this.A);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_20_2x);
        int i = R.color.s1;
        DrawableCompat.setTint(drawable, ContextCompat.getColor(this, i));
        getLeft().setImageDrawable(drawable);
        getTitleTextView().setTextColor(ContextCompat.getColor(this, i));
        findViewById(R.id.feedback_btn).setOnClickListener(new View.OnClickListener() { // from class: ns2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
