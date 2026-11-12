package com.huami.eid.ui.fragment;

import androidx.annotation.NonNull;
import androidx.p010navigation.ActionOnlyNavDirections;
import androidx.p010navigation.NavDirections;
import com.huami.eid.ui.R;

/* JADX INFO: loaded from: classes8.dex */
public class EidOpenFragmentDirections {
    private EidOpenFragmentDirections() {
    }

    @NonNull
    public static NavDirections actionToDetail() {
        return new ActionOnlyNavDirections(R.id.action_to_detail);
    }
}
