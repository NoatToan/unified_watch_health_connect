package h10;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.GroupSearchResultDTO;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f80801b;

    public /* synthetic */ p(r rVar, int i14) {
        this.f80800a = i14;
        this.f80801b = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int size;
        int i14 = this.f80800a;
        r rVar = this.f80801b;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj;
                if (rVar.isAdded()) {
                    int i15 = r.b.f80817a[g3Var.f35300a.ordinal()];
                    if (i15 == 1) {
                        T t7 = g3Var.f35301b;
                        if (t7 != 0) {
                            GroupSearchResultDTO groupSearchResultDTO = (GroupSearchResultDTO) t7;
                            if (rVar.getActivity() != null && !rVar.getActivity().isFinishing()) {
                                ArrayList arrayList = groupSearchResultDTO.f36393a;
                                if (arrayList == null || arrayList.size() == 0) {
                                    if (rVar.f80814h == 1) {
                                        rVar.f80808b.clear();
                                        rVar.f80808b.notifyDataSetChanged();
                                        String str = rVar.f80807a;
                                        if (str == null || str.length() < 2) {
                                            rVar.f80812f.setText(rVar.getString(R.string.search_keyword_too_short_with_chars_count_limitation, 2));
                                        } else {
                                            rVar.f80812f.setText(rVar.getString(R.string.lbl_no_results_found));
                                        }
                                        rVar.f80812f.setVisibility(0);
                                    }
                                    size = 0;
                                } else {
                                    size = groupSearchResultDTO.f36393a.size();
                                    rVar.f80808b.addAll(groupSearchResultDTO.f36393a);
                                    rVar.f80808b.notifyDataSetChanged();
                                    rVar.f80812f.setVisibility(8);
                                }
                                r.a aVar = rVar.f80813g;
                                if (size == 0 || size < aVar.f149664a) {
                                    aVar.f149665b = true;
                                }
                                aVar.f149666c = false;
                                aVar.f149667d += size;
                                ((com.garmin.android.apps.connectmobile.c) rVar.getActivity()).hideProgressOverlay();
                            }
                        } else {
                            rVar.f80808b.notifyDataSetChanged();
                        }
                        ((com.garmin.android.apps.connectmobile.c) rVar.getActivity()).hideProgressOverlay();
                    } else if (i15 == 2 && rVar.getActivity() != null && !rVar.getActivity().isFinishing()) {
                        rVar.f80813g.f149666c = false;
                        rVar.f80812f.setText(rVar.getString(R.string.txt_empty_page_unable_load));
                        rVar.f80812f.setVisibility(0);
                        ((com.garmin.android.apps.connectmobile.c) rVar.getActivity()).hideProgressOverlay();
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = rVar.f80808b.f80760h;
                arrayList2.clear();
                arrayList2.addAll((List) obj);
                rVar.f80808b.notifyDataSetChanged();
                break;
        }
    }
}
