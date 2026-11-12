package a73;

import android.location.Location;
import bs2.sc;
import com.garmin.android.gncs.datasource.GncsDataSourceSender;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.lang3.ArchUtils;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.arch.Processor;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableConsumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1868b;

    public /* synthetic */ o(Object obj, int i14) {
        this.f1867a = i14;
        this.f1868b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i14 = this.f1867a;
        Object obj2 = this.f1868b;
        switch (i14) {
            case 0:
                Failable.accept((FailableConsumer<Object, E>) obj2, obj);
                break;
            case 1:
                ((sc) obj2).f20480a.add((String) obj);
                break;
            case 2:
                ((GncsDataSourceSender) obj2).lambda$sendDataMessage$0((byte[]) obj);
                break;
            case 3:
                ((mv0.b.a) obj2).accept((Location) obj);
                break;
            case 4:
                ((Exception) obj2).addSuppressed((IOException) obj);
                break;
            case 5:
                ((IOException) obj2).addSuppressed((IOException) obj);
                break;
            case 6:
                ArchUtils.addProcessor((String) obj, (Processor) obj2);
                break;
            case 7:
                Functions.accept((Functions.FailableConsumer) obj2, obj);
                break;
            case 8:
                ((List) obj2).add((Method) obj);
                break;
            default:
                ps.i iVar = (ps.i) obj;
                int i15 = po.h.E1;
                ((com.garmin.android.library.mapsdkadapter.e.a) obj2).b(new com.garmin.android.library.mapsdkadapter.f(iVar.getLat(), iVar.getLon(), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                break;
        }
    }
}
