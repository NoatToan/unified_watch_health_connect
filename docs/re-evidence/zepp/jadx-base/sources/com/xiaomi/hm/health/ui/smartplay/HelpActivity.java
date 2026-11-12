package com.xiaomi.hm.health.ui.smartplay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.mifit.analytics.Analytics;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.utils.Utils;

/* JADX INFO: loaded from: classes22.dex */
public class HelpActivity extends BaseTitleActivity {
    private String x;
    private final int[] y = {R.string.help_title_0, R.string.help_info_0, R.string.help_title_1, R.string.help_info_1, R.string.help_title_2, R.string.help_info_2, R.string.help_title_3, R.string.help_info_3, R.string.help_title_4, R.string.help_info_4};
    private final int[] z = {R.string.weight_help_title_0, R.string.weight_help_info_0, R.string.weight_help_title_1, R.string.weight_help_info_1, R.string.weight_help_title_2, R.string.weight_help_info_2, R.string.weight_help_title_3, R.string.weight_help_info_3, R.string.help_title_4, R.string.help_info_4, R.string.weight_help_title_4, R.string.weight_help_info_4};
    private final int[] A = {R.string.weight_help_title_0, R.string.weight_help_info_0, R.string.weight_help_title_1, R.string.weight_help_info_1, R.string.weight_help_title_2, R.string.weight_help_info_2, R.string.weight_help_title_3, R.string.weight_help_info_3, R.string.help_title_4, R.string.help_info_4};
    private final int[] B = {R.string.unlock_screen_help_title0, R.string.unlock_screen_help_info0, R.string.unlock_screen_help_title1, R.string.unlock_screen_help_info1, R.string.unlock_screen_help_title2, R.string.unlock_screen_help_info2, R.string.unlock_screen_help_title3, R.string.unlock_screen_help_info3};

    public class a extends RecyclerView.Adapter<C1026a> {
        public int[] a;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.HelpActivity$a$a, reason: collision with other inner class name */
        public class C1026a extends RecyclerView.ViewHolder {
            public TextView a;
            public TextView b;
            public View c;

            public C1026a(View itemView) {
                super(itemView);
                this.a = (TextView) itemView.findViewById(R.id.device_helper_title);
                this.b = (TextView) itemView.findViewById(R.id.device_helper_tips);
                this.c = itemView.findViewById(R.id.divider);
            }
        }

        public a(int[] resArr) {
            this.a = resArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull C1026a holder, int position) {
            if (Utils.TYPE_BAND.equals(HelpActivity.this.x) && position == 0) {
                TextView textView = holder.b;
                HelpActivity helpActivity = HelpActivity.this;
                textView.setText(helpActivity.getString(this.a[1], new Object[]{helpActivity.getString(R.string.mili_setting_mili)}));
            } else if (TextUtils.equals(Utils.TYPE_WEIGHT, HelpActivity.this.x) || (TextUtils.equals(Utils.TYPE_WEIGHT_PAIR, HelpActivity.this.x) && position == 0)) {
                String string = HelpActivity.this.getString(this.a[1]);
                if (string.contains("%s")) {
                    string = String.format(string, HelpActivity.this.getString(R.string.weight_setting_weight));
                }
                holder.b.setText(string);
            } else {
                holder.b.setText(this.a[(position * 2) + 1]);
            }
            holder.a.setText(this.a[position * 2]);
            if (position == (this.a.length / 2) - 1) {
                holder.c.setVisibility(8);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1026a onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new C1026a(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_device_helper_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getPagerCount() {
            return this.a.length / 2;
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_activity);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.pale_grey), true);
        setBaseTitleColor(ContextCompat.getColor(this, R.color.black70));
        int[] iArr = this.y;
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(Utils.REF_DEVICE_TYPE);
            this.x = stringExtra;
            if (Utils.TYPE_WEIGHT.equals(stringExtra)) {
                iArr = this.z;
            } else if (Utils.TYPE_BAND.equals(this.x)) {
                iArr = this.y;
            } else if (Utils.TYPE_UNLOCK_SCREEN.equals(this.x)) {
                iArr = this.B;
                setTitleText(getString(R.string.unlock_screen_invalid_helper));
            } else if (Utils.TYPE_WEIGHT_PAIR.equals(this.x)) {
                iArr = this.A;
            }
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.help_list);
        recyclerView.setAdapter(new a(iArr));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.event(this, StatEvent.EventId.SCREEN_UNLOCK_HELP_VIEW_NUM);
    }
}
