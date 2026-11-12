package com.xiaomi.hm.health.ui.sportfitness.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.ui.sportfitness.adapter.ExerciseTypeAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseChooseTypeFragment extends DialogFragment implements View.OnClickListener {
    private TextView a;
    private ExerciseTypeAdapter b;
    private DialogDismissListener c = null;

    public interface DialogDismissListener {
        void onDismiss(String title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AdapterView adapterView, View view, int i, long j) {
        if (this.b.getSelectIndex() != i) {
            this.b.setSelectIndex(i);
            this.b.notifyDataSetChanged();
            this.a.setText(this.b.getTypeTitles()[i]);
            HMKeeper.setChooseExerciseType(this.b.getExerTypeByDefIndex());
        }
        dismissAllowingStateLoss();
    }

    private void initView(View rootView) {
        GridView gridView = (GridView) rootView.findViewById(R.id.sport_type_grid_view);
        ExerciseTypeAdapter exerciseTypeAdapter = new ExerciseTypeAdapter(getContext());
        this.b = exerciseTypeAdapter;
        int[] typeTitles = exerciseTypeAdapter.getTypeTitles();
        if (this.b.setDefIndexByExerType(HMKeeper.getChooseExerciseType())) {
            this.a.setText(typeTitles[this.b.getSelectIndex()]);
        } else {
            this.a.setText(typeTitles[0]);
            HMKeeper.setChooseExerciseType(this.b.getExerTypeByDefIndex());
        }
        gridView.setAdapter((ListAdapter) this.b);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: pt1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.a.b(adapterView, view, i, j);
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.c != null && view.getId() == R.id.type_close_button) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, SystemBarTintSupport.isSupport(getActivity()) ? R.style.DimPanelTint : R.style.DimPanel);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.layout_exercise_choose_type, container, false);
        this.a = (TextView) viewInflate.findViewById(R.id.type_title);
        ((ImageView) viewInflate.findViewById(R.id.type_close_button)).setOnClickListener(this);
        initView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        DialogDismissListener dialogDismissListener = this.c;
        if (dialogDismissListener != null) {
            dialogDismissListener.onDismiss(this.a.getText().toString());
        }
    }

    public void setDialogDismissListener(DialogDismissListener listener) {
        this.c = listener;
    }
}
