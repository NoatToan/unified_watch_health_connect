package com.unionpay.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.tsmservice.data.UniteAppDetail;
import com.unionpay.ui.activity.UnionPayCardDetailActivity;
import com.unionpay.ui.adapter.InstalledBankCardListAdapter;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class InstalledUnionPayCardFragment extends Fragment {
    private static final String c = "installed_info";
    private RecyclerView a;
    private InstalledBankCardListAdapter b;

    public class a extends TypeToken<List<UniteAppDetail>> {
        public a() {
        }
    }

    private void b() {
        this.a.setLayoutManager(new LinearLayoutManager(getContext()));
        InstalledBankCardListAdapter installedBankCardListAdapter = new InstalledBankCardListAdapter();
        this.b = installedBankCardListAdapter;
        installedBankCardListAdapter.bindToRecyclerView(this.a);
        this.b.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: tf4
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                this.a.c(baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intent intent = new Intent(getActivity(), (Class<?>) UnionPayCardDetailActivity.class);
        UniteAppDetail item = this.b.getItem(i);
        if (item != null) {
            intent.putExtra(UnionPayCardDetailActivity.KEY_CARD_ID, item.getAppID());
        }
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Context context = getContext();
        Objects.requireNonNull(context);
        RecyclerView recyclerView = new RecyclerView(context, null, R.style.UnionPay);
        this.a = recyclerView;
        return recyclerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        b();
        if (getArguments() != null) {
            String string = getArguments().getString("installed_info", "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.b.setNewData((List) new Gson().fromJson(string, new a().getType()));
        }
    }
}
