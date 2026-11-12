package mt0;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengePlayerDTO;
import com.garmin.android.apps.connectmobile.leaderboard.model.VivoKidAdHocChallengePlayerDTO;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmt0/h2;", "Lcom/garmin/android/apps/connectmobile/o0;", "Landroid/widget/AbsListView$MultiChoiceModeListener;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class h2 extends com.garmin.android.apps.connectmobile.o0 implements AbsListView.MultiChoiceModeListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f120642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f120643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kt0.a f120644y = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void M6(boolean z14) {
        super.M6(!this.f120643x && z14);
    }

    public final void T6(AdapterView<?> adapterView, int i14) {
        Object itemAtPosition = adapterView.getItemAtPosition(i14);
        boolean z14 = itemAtPosition instanceof VivoKidAdHocChallengePlayerDTO;
        kt0.a aVar = this.f120644y;
        if (z14) {
            VivoKidAdHocChallengePlayerDTO vivoKidAdHocChallengePlayerDTO = (VivoKidAdHocChallengePlayerDTO) itemAtPosition;
            if (vivoKidAdHocChallengePlayerDTO.f38050p != -1) {
                return;
            }
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            aVar.a(contextRequireContext, vivoKidAdHocChallengePlayerDTO.f38014h, vivoKidAdHocChallengePlayerDTO.f38013g, vivoKidAdHocChallengePlayerDTO.f38012f);
            return;
        }
        if (itemAtPosition instanceof AdHocChallengePlayerDTO) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            AdHocChallengePlayerDTO adHocChallengePlayerDTO = (AdHocChallengePlayerDTO) itemAtPosition;
            aVar.a(contextRequireContext2, adHocChallengePlayerDTO.f38014h, adHocChallengePlayerDTO.f38013g, adHocChallengePlayerDTO.f38012f);
            return;
        }
        if (itemAtPosition instanceof ot0.a) {
            ot0.a aVar2 = (ot0.a) itemAtPosition;
            if (p005kotlin.jvm.internal.s.g(aVar2.f133714i, Boolean.TRUE)) {
                return;
            }
            Context contextRequireContext3 = requireContext();
            contextRequireContext3.getClass();
            aVar.a(contextRequireContext3, aVar2.f133713h, aVar2.f133712g, aVar2.f133711f);
        }
    }

    public abstract boolean U6(int i14);

    public abstract boolean V6();

    public abstract void X6();

    public int Y6() {
        return R.menu.list_delete;
    }

    public abstract void c7();

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        actionMode.getClass();
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_delete) {
            return false;
        }
        if (getActivity() != null) {
            new androidx.appcompat.app.e.a(requireActivity()).setCancelable(true).setTitle(R.string.social_challenge_remove_participants_title).setMessage(R.string.social_challenge_remove_participants_msg).setPositiveButton(R.string.lbl_remove, new hg1.g(17, this, actionMode)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        u6();
        ListView listView = this.f7311e;
        listView.getClass();
        if (V6()) {
            listView.setChoiceMode(3);
            listView.setMultiChoiceModeListener(this);
        }
        listView.setOnItemClickListener(new ey.a(this, 4));
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        this.f120643x = true;
        M6(false);
        actionMode.getMenuInflater().inflate(Y6(), menu);
        TextView textView = new TextView(getContext());
        textView.setTextAppearance(textView.getContext(), R.style.ActionMode_Title_Gcm);
        textView.setText(R.string.social_select_people);
        this.f120642w = textView;
        actionMode.setCustomView(textView);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
        this.f120643x = false;
        this.f120642w = null;
        M6(true);
    }

    @Override // android.widget.AbsListView.MultiChoiceModeListener
    public final void onItemCheckedStateChanged(ActionMode actionMode, int i14, long j8, boolean z14) {
        TextView textView;
        actionMode.getClass();
        u6();
        ListView listView = this.f7311e;
        listView.getClass();
        if (z14 && !U6(i14)) {
            listView.setItemChecked(i14, false);
            return;
        }
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        int size = checkedItemPositions.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            if (checkedItemPositions.get(checkedItemPositions.keyAt(i16))) {
                i15++;
            }
        }
        if (i15 > 0 && (textView = this.f120642w) != null) {
            textView.setText(String.valueOf(i15));
        }
        X6();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Drawable icon;
        Drawable drawableMutate;
        actionMode.getClass();
        menu.getClass();
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_delete);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null || (drawableMutate = icon.mutate()) == null) {
            return false;
        }
        drawableMutate.setColorFilter(a7.b.getColor(requireContext(), R.color.gcm_icon_primary_action_selector), PorterDuff.Mode.SRC_ATOP);
        return false;
    }
}
