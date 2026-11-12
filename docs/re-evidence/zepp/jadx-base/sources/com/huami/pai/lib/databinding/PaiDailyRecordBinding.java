package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.pai.view.PAIHorizontalRecyclerView;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiDailyRecordBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final PAIHorizontalRecyclerView paiValueList;

    private PaiDailyRecordBinding(@NonNull View rootView, @NonNull PAIHorizontalRecyclerView paiValueList) {
        this.a = rootView;
        this.paiValueList = paiValueList;
    }

    @NonNull
    public static PaiDailyRecordBinding bind(@NonNull View rootView) {
        int i = R.id.pai_value_list;
        PAIHorizontalRecyclerView pAIHorizontalRecyclerView = (PAIHorizontalRecyclerView) ViewBindings.findChildViewById(rootView, i);
        if (pAIHorizontalRecyclerView != null) {
            return new PaiDailyRecordBinding(rootView, pAIHorizontalRecyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PaiDailyRecordBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.pai_daily_record, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
