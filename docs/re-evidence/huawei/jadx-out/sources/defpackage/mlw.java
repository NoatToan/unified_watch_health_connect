package defpackage;

import android.text.TextUtils;
import androidx.collection.SimpleArrayMap;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.util.LogUtil;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes10.dex */
public class mlw {
    private final SimpleArrayMap<SocketChannel, mlx> e = new SimpleArrayMap<>(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleArrayMap<String, mlx> f41899a = new SimpleArrayMap<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f41900b = new Object();

    public void b(mlx mlxVar) {
        if (mlxVar == null) {
            LogUtil.d("DistributionNetworkProxyStreamsMap", "stream is null");
            return;
        }
        synchronized (this.f41900b) {
            this.e.put(mlxVar.j(), mlxVar);
            this.f41899a.put(e(mlxVar.f(), mlxVar.g()), mlxVar);
        }
    }

    public mlx c(SocketChannel socketChannel) {
        mlx mlxVar;
        if (socketChannel == null) {
            LogUtil.d("DistributionNetworkProxyStreamsMap", "removeStream() channel is null");
            return new mlx(false);
        }
        synchronized (this.f41900b) {
            mlxVar = this.e.get(socketChannel);
            if (mlxVar != null) {
                this.e.remove(mlxVar.j());
                this.f41899a.remove(e(mlxVar.f(), mlxVar.g()));
                LogUtil.a("DistributionNetworkProxyStreamsMap", "had removed from map");
            }
        }
        return mlxVar;
    }

    public void e() {
        synchronized (this.f41900b) {
            this.e.clear();
            this.f41899a.clear();
        }
    }

    public mlx a(SocketChannel socketChannel) {
        mlx mlxVar;
        if (socketChannel == null) {
            LogUtil.d("DistributionNetworkProxyStreamsMap", "getStream() channel is null");
            return new mlx(false);
        }
        synchronized (this.f41900b) {
            mlxVar = this.e.get(socketChannel);
        }
        return mlxVar;
    }

    public mlx d(String str, int i) {
        mlx mlxVar;
        if (TextUtils.isEmpty(str) || i < 0) {
            LogUtil.d("DistributionNetworkProxyStreamsMap", "nodeId: ", str, "streamId: ", Integer.valueOf(i));
            return new mlx(false);
        }
        synchronized (this.f41900b) {
            mlxVar = this.f41899a.get(e(str, i));
        }
        return mlxVar;
    }

    private static String e(String str, int i) {
        if (TextUtils.isEmpty(str) || i < 0) {
            LogUtil.d("DistributionNetworkProxyStreamsMap", "nodeId: ", str, "streamId: ", Integer.valueOf(i));
            return "";
        }
        return str + Constants.LINK + i;
    }
}
