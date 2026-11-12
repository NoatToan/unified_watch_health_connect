package i20;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditContactMethodActivity f87174b;

    public /* synthetic */ m(EditContactMethodActivity editContactMethodActivity, int i14) {
        this.f87173a = i14;
        this.f87174b = editContactMethodActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f87173a;
        EditContactMethodActivity editContactMethodActivity = this.f87174b;
        switch (i15) {
            case 0:
                EditContactMethodActivity.a aVar = EditContactMethodActivity.f32519d;
                dialogInterface.dismiss();
                editContactMethodActivity.finish();
                break;
            case 1:
                EditContactMethodActivity.a aVar2 = EditContactMethodActivity.f32519d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                editContactMethodActivity.setResult(0);
                editContactMethodActivity.finish();
                break;
            case 2:
                EditContactMethodActivity.a aVar3 = EditContactMethodActivity.f32519d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                editContactMethodActivity.finish();
                break;
            case 3:
                EditContactMethodActivity.a aVar4 = EditContactMethodActivity.f32519d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                editContactMethodActivity.setResult(0);
                editContactMethodActivity.finish();
                break;
            case 4:
                EditContactMethodActivity.a aVar5 = EditContactMethodActivity.f32519d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                editContactMethodActivity.finish();
                break;
            default:
                EditContactMethodActivity.a aVar6 = EditContactMethodActivity.f32519d;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                editContactMethodActivity.finish();
                break;
        }
    }
}
