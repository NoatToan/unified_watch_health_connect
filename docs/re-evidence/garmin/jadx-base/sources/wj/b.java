package wj;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import com.dsi.ant.channel.AntCommandFailedException;
import com.dsi.ant.channel.ChannelNotAvailableException;
import com.dsi.ant.channel.UnsupportedFeatureException;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj.b f185710a;

    public b(IBinder iBinder) {
        this.f185710a = new yj.b(iBinder);
    }

    public final a a(Context context, k kVar) throws ChannelNotAvailableException {
        yj.d dVarP;
        if (k.INVALID == kVar) {
            vb.h.s("Invalid predefined network requested");
            return null;
        }
        Bundle bundle = new Bundle();
        int i14 = kVar.f185771a;
        yj.b bVar = this.f185710a;
        bVar.getClass();
        yj.e eVar = bVar.f197463a;
        if (vj.a.a(context) >= 40400) {
            Message messageObtain = Message.obtain();
            messageObtain.what = yj.b.a.ACQUIRE_CHANNEL_PREDEFINED_NETWORK.f197467a;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.dsi.channel.data.versioncode", 40800);
            bundle2.putInt("com.dsi.channel.data.predefinednetwork", i14);
            bundle2.putParcelable("com.dsi.channel.data.requiredcapabilities", null);
            bundle2.putParcelable("com.dsi.channel.data.desiredcapabilities", null);
            messageObtain.setData(bundle2);
            yj.c cVarA = eVar.a(messageObtain, bundle);
            messageObtain.recycle();
            Iterator<IBinder> it = cVarA.f197468a.f197470b.iterator();
            dVarP = it.hasNext() ? yj.d.a.k0(it.next()) : null;
        } else {
            dVarP = eVar.p(i14, bundle);
        }
        yj.a aVar = dVarP != null ? new yj.a(dVarP) : null;
        if (aVar == null) {
            bundle.setClassLoader(ChannelNotAvailableException.class.getClassLoader());
            throw ((ChannelNotAvailableException) bundle.getParcelable(Constants.IPC_BUNDLE_KEY_SEND_ERROR));
        }
        a aVar2 = new a(aVar);
        if (aVar2.f185705a.getCapabilities().f185739e.f185742c) {
            try {
                aVar2.g(h.f185763c);
            } catch (AntCommandFailedException unused) {
            }
        }
        return aVar2;
    }

    public final a b(Context context, j jVar) throws ChannelNotAvailableException, UnsupportedFeatureException {
        Bundle bundle = new Bundle();
        yj.b bVar = this.f185710a;
        bVar.getClass();
        if (vj.a.a(context) < 40400) {
            throw new UnsupportedFeatureException("Private Network feature is not supported on installed version of ANT Radio Service");
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = yj.b.a.ACQUIRE_CHANNEL_PRIVATE_NETWORK.f197467a;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("com.dsi.channel.data.versioncode", 40800);
        bundle2.putParcelable("com.dsi.channel.data.networkkey", jVar);
        bundle2.putParcelable("com.dsi.channel.data.requiredcapabilities", null);
        bundle2.putParcelable("com.dsi.channel.data.desiredcapabilities", null);
        messageObtain.setData(bundle2);
        yj.c cVarA = bVar.f197463a.a(messageObtain, bundle);
        messageObtain.recycle();
        Iterator<IBinder> it = cVarA.f197468a.f197470b.iterator();
        yj.d dVarK0 = it.hasNext() ? yj.d.a.k0(it.next()) : null;
        yj.a aVar = dVarK0 != null ? new yj.a(dVarK0) : null;
        if (aVar == null) {
            bundle.setClassLoader(ChannelNotAvailableException.class.getClassLoader());
            throw ((ChannelNotAvailableException) bundle.getParcelable(Constants.IPC_BUNDLE_KEY_SEND_ERROR));
        }
        a aVar2 = new a(aVar);
        if (aVar2.f185705a.getCapabilities().f185739e.f185742c) {
            try {
                aVar2.g(h.f185763c);
            } catch (AntCommandFailedException unused) {
            }
        }
        return aVar2;
    }
}
