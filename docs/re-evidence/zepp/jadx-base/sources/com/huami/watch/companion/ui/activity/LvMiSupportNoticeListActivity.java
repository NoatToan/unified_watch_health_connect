package com.huami.watch.companion.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.companion.R;
import com.huami.watch.companion.notification.bean.LvMiNoticeBean;
import com.huami.watch.companion.ui.adapter.LvMiSupportNoticeAdapter;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class LvMiSupportNoticeListActivity extends AppCompatActivity {
    private RecyclerView a;
    private LvMiSupportNoticeAdapter b;
    private List<LvMiNoticeBean> c;

    private void d() {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_lvmi_support_notice_header, (ViewGroup) this.a, false);
        this.b.setHeaderView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_header);
        SpannableString spannableString = new SpannableString(getString(R.string.lvmi_support_notice_header));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#dc2b0b")), 1, 2, 17);
        textView.setText(spannableString);
    }

    private void e() {
        this.a.setLayoutManager(new LinearLayoutManager(this));
        LvMiSupportNoticeAdapter lvMiSupportNoticeAdapter = new LvMiSupportNoticeAdapter();
        this.b = lvMiSupportNoticeAdapter;
        this.a.setAdapter(lvMiSupportNoticeAdapter);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        onBackPressed();
    }

    private void initData() {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_body), R.drawable.ic_lvmi_body, 1, getString(R.string.lvmi_notice_body_detail)));
        this.c.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_door), R.drawable.ic_lvmi_door, 1, getString(R.string.lvmi_notice_door_detail)));
        this.c.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_move), R.drawable.ic_lvmi_move, 1, getString(R.string.lvmi_notice_move_detail)));
        this.c.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_magic), R.drawable.ic_lvmi_magic_cube, 1, getString(R.string.lvmi_notice_magic_detail)));
        this.c.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_gas), R.drawable.ic_lvmi_gas, getString(R.string.lvmi_notice_gas_detail)));
        this.c.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_smog), R.drawable.ic_lvmi_smog, getString(R.string.lvmi_notice_smog_detail)));
        this.c.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_water), R.drawable.ic_lvmi_water, getString(R.string.lvmi_notice_water_detail)));
        this.c.add(new LvMiNoticeBean(getString(R.string.lvmi_notice_lock), R.drawable.ic_lvmi_lock, getString(R.string.lvmi_notice_lock_detail)));
        this.b.setNewData(this.c);
    }

    private void initView() {
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        this.a = (RecyclerView) findViewById(R.id.recycle_view);
        actionbarLayout.setTitleText(getString(R.string.support_str));
        actionbarLayout.setBackArrowClickListener(new View.OnClickListener() { // from class: yt4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f(view);
            }
        });
        e();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_lvmi_support_notice_list);
        initView();
        initData();
    }
}
