package wn1;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.smartscale.IndexScaleTellUSMoreActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IndexScaleTellUSMoreActivity f186207b;

    public /* synthetic */ e(IndexScaleTellUSMoreActivity indexScaleTellUSMoreActivity, int i14) {
        this.f186206a = i14;
        this.f186207b = indexScaleTellUSMoreActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f186206a;
        IndexScaleTellUSMoreActivity indexScaleTellUSMoreActivity = this.f186207b;
        switch (i15) {
            case 0:
                IndexScaleTellUSMoreActivity.a aVar = IndexScaleTellUSMoreActivity.f44359h;
                dialogInterface.dismiss();
                long j8 = indexScaleTellUSMoreActivity.ka().f186218a;
                j0 j0Var = (j0) KoinJavaComponent.get$default(j0.class, null, null, 6, null);
                String str = IndexScaleTellUSMoreActivity.f44360i;
                str.getClass();
                j0Var.c(j8, str);
                indexScaleTellUSMoreActivity.setResult(0);
                indexScaleTellUSMoreActivity.finish();
                break;
            case 1:
                IndexScaleTellUSMoreActivity.a aVar2 = IndexScaleTellUSMoreActivity.f44359h;
                dialogInterface.dismiss();
                indexScaleTellUSMoreActivity.setResult(0);
                indexScaleTellUSMoreActivity.finish();
                break;
            default:
                IndexScaleTellUSMoreActivity.a aVar3 = IndexScaleTellUSMoreActivity.f44359h;
                indexScaleTellUSMoreActivity.finish();
                break;
        }
    }
}
