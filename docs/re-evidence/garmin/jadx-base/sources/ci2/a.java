package ci2;

import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isSuccess", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class a extends w implements e23.l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f27682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Fragment, Unit> f27683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, e23.l<? super Fragment, Unit> lVar) {
        super(1);
        this.f27682a = bVar;
        this.f27683b = lVar;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        b bVar = this.f27682a;
        bVar.f27686c.getClass();
        e23.l<Fragment, Unit> lVar = this.f27683b;
        if (zBooleanValue) {
            m.a aVar = m.f27713k;
            nh2.d dVar = bVar.f27687d;
            aVar.getClass();
            lVar.invoke(m.a.a(dVar));
        } else {
            i.c cVar = bVar.f27684a;
            Toast.makeText(cVar, cVar.getString(R.string.txt_empty_page_unable_load), 1).show();
            lVar.invoke(null);
        }
        return Unit.INSTANCE;
    }
}
