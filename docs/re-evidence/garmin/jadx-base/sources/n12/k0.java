package n12;

import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel", f = "EditProfileImageViewModel.kt", l = {329}, m = "updateProfileSucceeded", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f122251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f122252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditProfileImageViewModel f122253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f122254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(EditProfileImageViewModel editProfileImageViewModel, t13.d<? super k0> dVar) {
        super(dVar);
        this.f122253c = editProfileImageViewModel;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122252b = obj;
        this.f122254d |= Integer.MIN_VALUE;
        return EditProfileImageViewModel.x4(this.f122253c, this);
    }
}
