package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LocateCombinationDlgHelper;", "", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/LocateCombinationVo;", "Lkotlin/collections/ArrayList;", "vos", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showDlg", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LocateCombinationDlgHelper {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "selectIndex", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public final /* synthetic */ ArrayList<LocateCombinationVo> a;
        public final /* synthetic */ Function1<Integer, Unit> b;
        public final /* synthetic */ AlertDialogFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ArrayList<LocateCombinationVo> arrayList, Function1<? super Integer, Unit> function1, AlertDialogFragment alertDialogFragment) {
            super(1);
            this.a = arrayList;
            this.b = function1;
            this.c = alertDialogFragment;
        }

        public final void a(int i) {
            Iterator<LocateCombinationVo> it2 = this.a.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else if (it2.next().getSelected()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != i) {
                this.b.invoke(Integer.valueOf(i));
            }
            this.c.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @SuppressLint({"InflateParams"})
    public final void showDlg(@NotNull AppCompatActivity activity, @NotNull ArrayList<LocateCombinationVo> vos, @NotNull Function1<? super Integer, Unit> listener) {
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.layout_locate_combination, (ViewGroup) null);
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(activity).setTitle(R.string.ds_gps_diy_mode).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setContentView(viewInflate).create();
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.locate_combination_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(new LocationCombinationAdapter(vos, new a(vos, listener, alertDialogFragmentCreate)));
        alertDialogFragmentCreate.show(activity.getSupportFragmentManager());
    }
}
