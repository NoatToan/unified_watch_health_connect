package xg0;

import android.content.Context;
import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f190757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f190758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f190759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wg0.a f190760e;

    public /* synthetic */ e(Context context, wg0.a aVar, e23.a aVar2, o oVar) {
        this.f190756a = 0;
        this.f190757b = context;
        this.f190760e = aVar;
        this.f190758c = aVar2;
        this.f190759d = oVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f190756a) {
            case 0:
                final wg0.a aVar = this.f190760e;
                Object[] objArr = {aVar.f185047f};
                Context context = this.f190757b;
                String string = context.getString(R.string.mute_connection_message, objArr);
                string.getClass();
                androidx.appcompat.app.e.a message = new androidx.appcompat.app.e.a(context).setTitle(R.string.mute_this_user_title).setMessage(string);
                final int i14 = 0;
                final o oVar = this.f190759d;
                message.setPositiveButton(R.string.lbl_mute, new DialogInterface.OnClickListener() { // from class: xg0.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        switch (i14) {
                            case 0:
                                oVar.L5(aVar.f185046e);
                                break;
                            case 1:
                                oVar.Q1(aVar);
                                break;
                            default:
                                oVar.Q1(aVar);
                                break;
                        }
                    }
                }).setNegativeButton(R.string.lbl_cancel, new vu1.k(18)).show();
                this.f190758c.invoke();
                break;
            case 1:
                androidx.appcompat.app.e.a message2 = new androidx.appcompat.app.e.a(this.f190757b).setTitle(R.string.social_group_delete_announcement_title).setMessage(R.string.social_group_delete_announcement_message);
                final int i15 = 1;
                final o oVar2 = this.f190759d;
                final wg0.a aVar2 = this.f190760e;
                message2.setPositiveButton(R.string.lbl_delete, new DialogInterface.OnClickListener() { // from class: xg0.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16) {
                        switch (i15) {
                            case 0:
                                oVar2.L5(aVar2.f185046e);
                                break;
                            case 1:
                                oVar2.Q1(aVar2);
                                break;
                            default:
                                oVar2.Q1(aVar2);
                                break;
                        }
                    }
                }).setNegativeButton(R.string.lbl_cancel, new vu1.k(19)).show();
                this.f190758c.invoke();
                break;
            default:
                androidx.appcompat.app.e.a message3 = new androidx.appcompat.app.e.a(this.f190757b).setTitle(R.string.social_group_delete_post_title).setMessage(R.string.social_group_delete_post_message);
                final int i16 = 2;
                final o oVar3 = this.f190759d;
                final wg0.a aVar3 = this.f190760e;
                message3.setPositiveButton(R.string.lbl_delete, new DialogInterface.OnClickListener() { // from class: xg0.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i17) {
                        switch (i16) {
                            case 0:
                                oVar3.L5(aVar3.f185046e);
                                break;
                            case 1:
                                oVar3.Q1(aVar3);
                                break;
                            default:
                                oVar3.Q1(aVar3);
                                break;
                        }
                    }
                }).setNegativeButton(R.string.lbl_cancel, new vu1.k(20)).show();
                this.f190758c.invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(int i14, Context context, e23.a aVar, wg0.a aVar2, o oVar) {
        this.f190756a = i14;
        this.f190757b = context;
        this.f190758c = aVar;
        this.f190759d = oVar;
        this.f190760e = aVar2;
    }
}
