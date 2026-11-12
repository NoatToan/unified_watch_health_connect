package com.xiaomi.hm.health.lab.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.view.CountDownTextView;

/* JADX INFO: loaded from: classes21.dex */
public class CountDownFragment extends Fragment {
    private CountDownTextView a;
    private CountDownTextView.OnStateChangeListener b;

    public void endCountDown() {
        this.a.clearAnimation();
        this.a.cancleTextAnimator();
        this.a.setText((CharSequence) null);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_count_down, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        CountDownTextView countDownTextView = (CountDownTextView) view.findViewById(R.id.tx_count_down);
        this.a = countDownTextView;
        CountDownTextView.OnStateChangeListener onStateChangeListener = this.b;
        if (onStateChangeListener != null) {
            countDownTextView.setOnStateChangeListener(onStateChangeListener);
        }
        super.onViewCreated(view, bundle);
    }

    public void setOnStateChangeListener(CountDownTextView.OnStateChangeListener onStateChangeListener) {
        this.b = onStateChangeListener;
    }

    public void startCountDown() {
        this.a.clearAnimation();
        this.a.startTextAnimator(3);
    }
}
