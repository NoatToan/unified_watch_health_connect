package com.unionpay.ui.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.watch.companion.nfc.unionpay.R;
import com.unionpay.repo.WatchUnionpayRepo;
import com.unionpay.tsm.TsmHelper;
import com.unionpay.ui.activity.UnionPayCardDetailActivity;
import com.unionpay.ui.activity.WatchUnlockActivity;
import com.unionpay.util.BankRx;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class WatchUnlockFragment extends Fragment implements View.OnClickListener {
    private View a;
    private int b;
    private boolean c;
    private Lazy<WatchUnionpayRepo> d = KoinJavaComponent.inject(WatchUnionpayRepo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(DialogInterface dialogInterface, int i) {
        TsmHelper.getHelper(getActivity()).release();
        startActivity(new Intent(getActivity(), (Class<?>) UnionPayCardDetailActivity.class));
        getActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ObservableEmitter observableEmitter) throws Exception {
        observableEmitter.onNext(Boolean.valueOf(this.d.getValue().verifyPwd()));
    }

    private void initView(View view) {
        TextView textView = (TextView) view.findViewById(R.id.unlock_msg);
        View viewFindViewById = view.findViewById(R.id.forget_pwd);
        int i = this.b;
        if (i == 0) {
            textView.setText(R.string.wl_watch_unlock);
        } else if (i == 1) {
            textView.setText(R.string.wl_watch_unbind_unlock);
            viewFindViewById.setVisibility(0);
        }
        this.a = view.findViewById(R.id.watch_unlock_complete);
        viewFindViewById.setOnClickListener(this);
        view.findViewById(R.id.watch_unlock).setOnClickListener(this);
        this.a.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Boolean bool) throws Exception {
        this.c = bool.booleanValue();
        this.a.setEnabled(bool.booleanValue());
    }

    private void k() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.b = arguments.getInt(WatchUnlockActivity.ARGS_ACTION, 0);
        }
    }

    private void l() {
        if (getActivity() == null) {
            return;
        }
        new AlertDialogFragment.Builder(getContext()).setTitle(R.string.wl_watch_forget_pwd_title).setMessage(R.string.wl_watch_forget_pwd_msg).setNegativeButton(getString(R.string.wl_bank_cancel), new DialogInterface.OnClickListener() { // from class: ml8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(R.string.wl_bank_to_remove_unbind, new DialogInterface.OnClickListener() { // from class: kl8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.g(dialogInterface, i);
            }
        }).create().show(getChildFragmentManager(), "Forget Watch Pwd");
    }

    private void m() {
        new AlertDialogFragment.Builder(getContext()).setTitle(R.string.wl_watch_unlock_dialog_title).setMessage(R.string.wl_watch_unlock_dialog_message).setNeutralButton(R.string.wl_bank_btn_known, new DialogInterface.OnClickListener() { // from class: ll8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create().show(getChildFragmentManager(), "watch_unlock");
    }

    private void n() {
        if (getActivity() == null) {
            return;
        }
        BankRx.io(new ObservableOnSubscribe() { // from class: nl8
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.i(observableEmitter);
            }
        }).safeSubscribe(new Consumer() { // from class: ol8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.j((Boolean) obj);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.watch_unlock) {
            n();
            m();
            return;
        }
        if (view.getId() != R.id.watch_unlock_complete) {
            if (view.getId() == R.id.forget_pwd) {
                l();
            }
        } else if (!this.c) {
            m();
        } else if (getActivity() != null) {
            getActivity().setResult(-1);
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.wl_fragment_watch_unlock, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        k();
        initView(view);
    }
}
