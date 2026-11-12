package aq;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class n extends h32.b {
    public n(androidx.fragment.app.v vVar) {
        super(vVar);
    }

    @Override // fe.a
    /* JADX INFO: renamed from: getCount */
    public final int getF44052d() {
        return 2;
    }

    @Override // androidx.fragment.app.a0
    public final Fragment getItem(int i14) {
        boolean z14 = i14 == 0;
        Bundle bundle = new Bundle();
        bundle.putBoolean("isRoadCyclist", z14);
        s3 s3Var = new s3();
        s3Var.setArguments(bundle);
        return s3Var;
    }

    @Override // fe.a
    public final CharSequence getPageTitle(int i14) {
        c22.o oVar = (c22.o) KoinJavaComponent.get(c22.o.class);
        if (i14 == 0) {
            return oVar.c().getString(R.string.lbl_road_cyclist);
        }
        return i14 == 1 ? oVar.c().getString(R.string.lbl_time_trialist) : super.getPageTitle(i14);
    }
}
