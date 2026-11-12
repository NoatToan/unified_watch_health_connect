package com.mapbox.maps;

import android.os.Handler;
import android.os.Looper;
import cd0.h0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b!\u0010\"JG\u0010,\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010'2\b\u0010+\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J!\u00103\u001a\b\u0012\u0004\u0012\u00020/022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e02¢\u0006\u0004\b3\u0010\"J\u0015\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00072\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b:\u0010;J)\u0010@\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020<¢\u0006\u0004\bH\u0010IJ)\u0010K\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010F\u001a\u00020<2\u0006\u0010J\u001a\u00020B¢\u0006\u0004\bK\u0010LJ!\u0010M\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bM\u0010EJ\u0015\u0010N\u001a\u00020G2\u0006\u0010F\u001a\u00020<¢\u0006\u0004\bN\u0010IJ)\u0010O\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010F\u001a\u00020<2\u0006\u0010J\u001a\u00020B¢\u0006\u0004\bO\u0010LJ9\u0010Q\u001a\u00020\u00162\f\u0010P\u001a\b\u0012\u0004\u0012\u00020 022\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'¢\u0006\u0004\bQ\u0010RJ+\u0010Q\u001a\u00020\u00162\f\u0010P\u001a\b\u0012\u0004\u0012\u00020 022\u0006\u0010S\u001a\u00020\u00162\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bQ\u0010VJM\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00160>2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020 022\u0006\u0010S\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010*\u001a\u0004\u0018\u00010'2\b\u0010+\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\bQ\u0010WJ3\u0010Z\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020X2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u0004\u0018\u00010'2\u0006\u0010\\\u001a\u00020 ¢\u0006\u0004\b]\u0010^J\u0017\u0010a\u001a\u00020\u00072\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0004\ba\u0010bJ)\u0010f\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010c\u001a\u00020<2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ)\u0010h\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010c\u001a\u00020<2\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bh\u0010gJ!\u0010i\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010c\u001a\u00020<¢\u0006\u0004\bi\u0010jJ!\u0010k\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020d0>2\u0006\u0010c\u001a\u00020<¢\u0006\u0004\bk\u0010jJ%\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\u001d2\u0006\u0010m\u001a\u00020l2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010q\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bq\u0010rJ\u0015\u0010s\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bs\u0010rJ\u0015\u0010u\u001a\u00020t2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bu\u0010vJ!\u0010x\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020 0\u001d¢\u0006\u0004\bx\u0010\"J\u0015\u0010z\u001a\u00020\u00072\u0006\u0010y\u001a\u000204¢\u0006\u0004\bz\u00107J\r\u0010{\u001a\u000204¢\u0006\u0004\b{\u0010|J\"\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00072\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008c\u0001\u001a\u00020\u00072\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\u00072\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\u00072\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0097\u0001\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u000f\u0010\u0099\u0001\u001a\u00020\u0007¢\u0006\u0005\b\u0099\u0001\u0010\u0012J5\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010\u009a\u0001\u001a\u00020<2\u0006\u0010F\u001a\u00020<2\u0006\u0010J\u001a\u00020B¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0018\u0010\u009d\u0001\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020 ¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0019\u0010 \u0001\u001a\u00020 2\u0007\u0010\u009f\u0001\u001a\u00020\u001e¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0017\u0010£\u0001\u001a\t\u0012\u0005\u0012\u00030¢\u000102¢\u0006\u0006\b£\u0001\u0010¤\u0001J)\u0010§\u0001\u001a\u00020\u00072\u000e\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¢\u0001022\u0007\u0010¦\u0001\u001a\u000204¢\u0006\u0006\b§\u0001\u0010¨\u0001J1\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010©\u0001\u001a\u00020B2\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J;\u0010°\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010\u009a\u0001\u001a\u00020<2\b\u0010¯\u0001\u001a\u00030®\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J0\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010C\u001a\u00020B2\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b²\u0001\u0010\u00ad\u0001J;\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010\u009a\u0001\u001a\u00020<2\b\u0010¯\u0001\u001a\u00030®\u00012\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b³\u0001\u0010±\u0001J$\u0010´\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002040>2\u0007\u0010\u009a\u0001\u001a\u00020<¢\u0006\u0005\b´\u0001\u0010jJ1\u0010µ\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010\u009a\u0001\u001a\u00020<2\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0019\u0010¸\u0001\u001a\u00020\u00072\u0007\u0010·\u0001\u001a\u00020<¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0010\u0010º\u0001\u001a\u00020<¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0010\u0010¼\u0001\u001a\u00020<¢\u0006\u0006\b¼\u0001\u0010»\u0001J\u0019\u0010¾\u0001\u001a\u00020\u00072\u0007\u0010½\u0001\u001a\u00020<¢\u0006\u0006\b¾\u0001\u0010¹\u0001J\u0010\u0010¿\u0001\u001a\u00020\u0016¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0011\u0010Â\u0001\u001a\u00030Á\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001a\u0010Å\u0001\u001a\u00020\u00072\b\u0010Ä\u0001\u001a\u00030Á\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J$\u0010Ç\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010\u009a\u0001\u001a\u00020<¢\u0006\u0005\bÇ\u0001\u0010jJ\u0019\u0010È\u0001\u001a\u0002042\u0007\u0010\u009a\u0001\u001a\u00020<¢\u0006\u0006\bÈ\u0001\u0010É\u0001J!\u0010Ê\u0001\u001a\u00020G2\u0007\u0010\u009a\u0001\u001a\u00020<2\u0006\u0010F\u001a\u00020<¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J,\u0010Ì\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010\u009a\u0001\u001a\u00020<2\u0006\u0010C\u001a\u00020B¢\u0006\u0005\bÌ\u0001\u0010LJ,\u0010Î\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0007\u0010Í\u0001\u001a\u00020B¢\u0006\u0005\bÎ\u0001\u0010LJ#\u0010Ï\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020B0>2\u0006\u0010=\u001a\u00020<¢\u0006\u0005\bÏ\u0001\u0010jJ.\u0010Ò\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\b\u0010Ñ\u0001\u001a\u00030Ð\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J$\u0010Ô\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020B0>2\u0007\u0010\u009a\u0001\u001a\u00020<¢\u0006\u0005\bÔ\u0001\u0010jJ#\u0010Õ\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<¢\u0006\u0005\bÕ\u0001\u0010jJ=\u0010Ù\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0007\u0010Ö\u0001\u001a\u00020n2\u000e\u0010Ø\u0001\u001a\t\u0012\u0005\u0012\u00030×\u00010\u001d¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0018\u0010Û\u0001\u001a\u0002042\u0006\u0010=\u001a\u00020<¢\u0006\u0006\bÛ\u0001\u0010É\u0001J5\u0010Ý\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010Ü\u0001\u001a\u00020<2\u0006\u0010F\u001a\u00020<2\u0006\u0010J\u001a\u00020B¢\u0006\u0006\bÝ\u0001\u0010\u009c\u0001J\u0017\u0010ß\u0001\u001a\t\u0012\u0005\u0012\u00030Þ\u00010\u001d¢\u0006\u0006\bß\u0001\u0010¤\u0001J$\u0010á\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010à\u0001\u001a\u00020B¢\u0006\u0005\bá\u0001\u0010EJ#\u0010â\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010C\u001a\u00020B¢\u0006\u0005\bâ\u0001\u0010EJ\u0017\u0010ã\u0001\u001a\u00020G2\u0006\u0010F\u001a\u00020<¢\u0006\u0005\bã\u0001\u0010IJ+\u0010ä\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010F\u001a\u00020<2\u0006\u0010J\u001a\u00020B¢\u0006\u0005\bä\u0001\u0010LJ!\u0010å\u0001\u001a\u00020G2\u0007\u0010Ü\u0001\u001a\u00020<2\u0006\u0010F\u001a\u00020<¢\u0006\u0006\bå\u0001\u0010Ë\u0001J\u001c\u0010ç\u0001\u001a\u0005\u0018\u00010Ð\u00012\u0007\u0010æ\u0001\u001a\u00020<¢\u0006\u0006\bç\u0001\u0010è\u0001J$\u0010é\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010æ\u0001\u001a\u00020<¢\u0006\u0005\bé\u0001\u0010jJ\u0019\u0010ê\u0001\u001a\u0002042\u0007\u0010æ\u0001\u001a\u00020<¢\u0006\u0006\bê\u0001\u0010É\u0001J.\u0010í\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010ë\u0001\u001a\u00020<2\u0007\u0010ì\u0001\u001a\u00020<¢\u0006\u0006\bí\u0001\u0010î\u0001J$\u0010ï\u0001\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010ë\u0001\u001a\u00020<¢\u0006\u0005\bï\u0001\u0010jJ\u0019\u0010ð\u0001\u001a\u0002042\u0007\u0010ë\u0001\u001a\u00020<¢\u0006\u0006\bð\u0001\u0010É\u0001J,\u0010õ\u0001\u001a\u00030ô\u00012\u0007\u0010Y\u001a\u00030ñ\u00012\u0007\u0010e\u001a\u00030ò\u00012\u0007\u0010\b\u001a\u00030ó\u0001¢\u0006\u0006\bõ\u0001\u0010ö\u0001J+\u0010ù\u0001\u001a\u00030ô\u00012\u0006\u0010=\u001a\u00020<2\u0007\u0010e\u001a\u00030÷\u00012\u0007\u0010\b\u001a\u00030ø\u0001¢\u0006\u0006\bù\u0001\u0010ú\u0001Jj\u0010\u0083\u0002\u001a\u00030ô\u00012\u0007\u0010û\u0001\u001a\u00020<2\b\u0010ü\u0001\u001a\u00030×\u00012\u0007\u0010ý\u0001\u001a\u00020<2\u0007\u0010þ\u0001\u001a\u00020<2)\u0010\u0081\u0002\u001a$\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020B\u0018\u00010ÿ\u0001j\u0011\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020B\u0018\u0001`\u0080\u00022\u0007\u0010\b\u001a\u00030\u0082\u0002¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J?\u0010\u0089\u0002\u001a\u00030ô\u00012\u0006\u0010=\u001a\u00020<2\t\u0010\u0085\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010\u0086\u0002\u001a\u00020<2\u0007\u0010\u0087\u0002\u001a\u00020B2\u0007\u0010\b\u001a\u00030\u0088\u0002¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J6\u0010\u008c\u0002\u001a\u00030ô\u00012\u0006\u0010=\u001a\u00020<2\t\u0010\u0085\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010\u0086\u0002\u001a\u00020<2\u0007\u0010\b\u001a\u00030\u008b\u0002¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002J\u0011\u0010\u008f\u0002\u001a\u00030\u008e\u0002¢\u0006\u0006\b\u008f\u0002\u0010\u0090\u0002J\u0018\u0010\u0018\u001a\u00020\u00072\b\u0010\u0091\u0002\u001a\u00030\u008e\u0002¢\u0006\u0005\b\u0018\u0010\u0092\u0002J-\u0010\u0093\u0002\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0007\u0010Ö\u0001\u001a\u00020n¢\u0006\u0006\b\u0093\u0002\u0010\u0094\u0002J+\u0010\u0095\u0002\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0006\u0010C\u001a\u00020B¢\u0006\u0005\b\u0095\u0002\u0010LJ7\u0010\u0099\u0002\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0007\u0010\u0096\u0002\u001a\u00020<2\b\u0010\u0098\u0002\u001a\u00030\u0097\u0002¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002JA\u0010\u009c\u0002\u001a\u00030ô\u00012\u0006\u0010=\u001a\u00020<2\t\u0010\u0085\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010\u0086\u0002\u001a\u00020<2\t\u0010\u009b\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010\b\u001a\u00030\u0088\u0002¢\u0006\u0006\b\u009c\u0002\u0010\u009d\u0002J-\u0010\u009e\u0002\u001a\u00030ô\u00012\u0006\u0010=\u001a\u00020<2\t\u0010\u0085\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010\b\u001a\u00030\u0088\u0002¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J\u001c\u0010¢\u0002\u001a\u00020\u00072\n\u0010¡\u0002\u001a\u0005\u0018\u00010 \u0002¢\u0006\u0006\b¢\u0002\u0010£\u0002J-\u0010¥\u0002\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0007\u0010e\u001a\u00030¤\u0002¢\u0006\u0006\b¥\u0002\u0010¦\u0002Jn\u0010¯\u0002\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0007\u0010æ\u0001\u001a\u00020<2\b\u0010¨\u0002\u001a\u00030§\u00022\b\u0010Ñ\u0001\u001a\u00030Ð\u00012\u0007\u0010©\u0002\u001a\u0002042\u000e\u0010«\u0002\u001a\t\u0012\u0005\u0012\u00030ª\u00020\u001d2\u000e\u0010¬\u0002\u001a\t\u0012\u0005\u0012\u00030ª\u00020\u001d2\n\u0010®\u0002\u001a\u0005\u0018\u00010\u00ad\u0002¢\u0006\u0006\b¯\u0002\u0010°\u0002J\u000f\u0010±\u0002\u001a\u00020\u0007¢\u0006\u0005\b±\u0002\u0010\u0012J\u000f\u0010²\u0002\u001a\u000204¢\u0006\u0005\b²\u0002\u0010|J \u0010³\u0002\u001a\u00020G2\u0006\u0010=\u001a\u00020<2\u0006\u0010F\u001a\u00020<¢\u0006\u0006\b³\u0002\u0010Ë\u0001J\u000f\u0010´\u0002\u001a\u000204¢\u0006\u0005\b´\u0002\u0010|J4\u0010µ\u0002\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0006\u0010=\u001a\u00020<2\u0006\u0010F\u001a\u00020<2\u0006\u0010J\u001a\u00020B¢\u0006\u0006\bµ\u0002\u0010\u009c\u0001J\u0017\u0010¶\u0002\u001a\u00020t2\u0006\u0010S\u001a\u00020\u0016¢\u0006\u0005\b¶\u0002\u0010vJ\u0017\u0010·\u0002\u001a\t\u0012\u0005\u0012\u00030Þ\u000102¢\u0006\u0006\b·\u0002\u0010¤\u0001J\u0017\u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030Þ\u000102¢\u0006\u0006\b¸\u0002\u0010¤\u0001J\u0018\u0010º\u0002\u001a\u00020\u00072\u0007\u0010¹\u0002\u001a\u000204¢\u0006\u0005\bº\u0002\u00107J\u000f\u0010»\u0002\u001a\u000204¢\u0006\u0005\b»\u0002\u0010|J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010½\u0002\u001a\u00030¼\u0002¢\u0006\u0006\b¾\u0002\u0010¿\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Á\u0002\u001a\u00030À\u0002¢\u0006\u0006\b¾\u0002\u0010Â\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ä\u0002\u001a\u00030Ã\u0002¢\u0006\u0006\b¾\u0002\u0010Å\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ç\u0002\u001a\u00030Æ\u0002¢\u0006\u0006\b¾\u0002\u0010È\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ê\u0002\u001a\u00030É\u0002¢\u0006\u0006\b¾\u0002\u0010Ë\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Í\u0002\u001a\u00030Ì\u0002¢\u0006\u0006\b¾\u0002\u0010Î\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ð\u0002\u001a\u00030Ï\u0002¢\u0006\u0006\b¾\u0002\u0010Ñ\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ó\u0002\u001a\u00030Ò\u0002¢\u0006\u0006\b¾\u0002\u0010Ô\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ö\u0002\u001a\u00030Õ\u0002¢\u0006\u0006\b¾\u0002\u0010×\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ù\u0002\u001a\u00030Ø\u0002¢\u0006\u0006\b¾\u0002\u0010Ú\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010Ü\u0002\u001a\u00030Û\u0002¢\u0006\u0006\b¾\u0002\u0010Ý\u0002J\u001d\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010ß\u0002\u001a\u00030Þ\u0002H\u0007¢\u0006\u0006\b¾\u0002\u0010à\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010â\u0002\u001a\u00030á\u0002¢\u0006\u0006\b¾\u0002\u0010ã\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010å\u0002\u001a\u00030ä\u0002¢\u0006\u0006\b¾\u0002\u0010æ\u0002J\u001b\u0010¾\u0002\u001a\u00030ô\u00012\b\u0010è\u0002\u001a\u00030ç\u0002¢\u0006\u0006\b¾\u0002\u0010é\u0002J&\u0010¾\u0002\u001a\u00030ô\u00012\u0007\u0010ê\u0002\u001a\u00020<2\b\u0010ì\u0002\u001a\u00030ë\u0002H\u0007¢\u0006\u0006\b¾\u0002\u0010í\u0002J\u0016\u0010î\u0002\u001a\b\u0012\u0004\u0012\u00020<02¢\u0006\u0006\bî\u0002\u0010¤\u0001J\"\u0010ñ\u0002\u001a\u00020\u00162\u0007\u0010ï\u0002\u001a\u00020\u001e2\u0007\u0010ð\u0002\u001a\u00020\u001e¢\u0006\u0006\bñ\u0002\u0010ò\u0002J\u001a\u0010õ\u0002\u001a\u00020\u00072\b\u0010ô\u0002\u001a\u00030ó\u0002¢\u0006\u0006\bõ\u0002\u0010ö\u0002J\u0011\u0010÷\u0002\u001a\u00030ó\u0002¢\u0006\u0006\b÷\u0002\u0010ø\u0002J \u0010û\u0002\u001a\u00020\u00072\u000e\u0010ú\u0002\u001a\t\u0012\u0005\u0012\u00030ù\u000202¢\u0006\u0006\bû\u0002\u0010ü\u0002J\u0017\u0010ý\u0002\u001a\t\u0012\u0005\u0012\u00030ù\u000202¢\u0006\u0006\bý\u0002\u0010¤\u0001J\"\u0010\u0080\u0003\u001a\u00020\u00072\u0007\u0010e\u001a\u00030þ\u00022\u0007\u0010\b\u001a\u00030ÿ\u0002¢\u0006\u0006\b\u0080\u0003\u0010\u0081\u0003J\u000f\u0010\u0082\u0003\u001a\u00020\u0007¢\u0006\u0005\b\u0082\u0003\u0010\u0012J0\u0010\u0085\u0003\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?0>2\u0010\u0010\u0084\u0003\u001a\u000b\u0012\u0004\u0012\u00020<\u0018\u00010\u0083\u0003H\u0007¢\u0006\u0006\b\u0085\u0003\u0010\u0086\u0003J\u0017\u0010\u0087\u0003\u001a\t\u0012\u0004\u0012\u00020<0\u0083\u0003¢\u0006\u0006\b\u0087\u0003\u0010\u0088\u0003J\u001b\u0010\u008b\u0003\u001a\u00030ô\u00012\b\u0010\u008a\u0003\u001a\u00030\u0089\u0003¢\u0006\u0006\b\u008b\u0003\u0010\u008c\u0003J\u001a\u0010\u008f\u0003\u001a\u00020\u00072\b\u0010\u008e\u0003\u001a\u00030\u008d\u0003¢\u0006\u0006\b\u008f\u0003\u0010\u0090\u0003J7\u0010\u0089\u0002\u001a\u00030ô\u00012\b\u0010\u0092\u0003\u001a\u00030\u0091\u00032\b\u0010\u0086\u0002\u001a\u00030\u0093\u00032\u0007\u0010\u0087\u0002\u001a\u00020B2\u0007\u0010\b\u001a\u00030\u0088\u0002¢\u0006\u0006\b\u0089\u0002\u0010\u0094\u0003J.\u0010\u008c\u0002\u001a\u00030ô\u00012\b\u0010\u0092\u0003\u001a\u00030\u0091\u00032\b\u0010\u0086\u0002\u001a\u00030\u0093\u00032\u0007\u0010\b\u001a\u00030\u008b\u0002¢\u0006\u0006\b\u008c\u0002\u0010\u0095\u0003J9\u0010\u009c\u0002\u001a\u00030ô\u00012\b\u0010\u0092\u0003\u001a\u00030\u0091\u00032\b\u0010\u0086\u0002\u001a\u00030\u0093\u00032\t\u0010\u009b\u0002\u001a\u0004\u0018\u00010<2\u0007\u0010\b\u001a\u00030\u0088\u0002¢\u0006\u0006\b\u009c\u0002\u0010\u0096\u0003J$\u0010\u009e\u0002\u001a\u00030ô\u00012\b\u0010\u0092\u0003\u001a\u00030\u0091\u00032\u0007\u0010\b\u001a\u00030\u0088\u0002¢\u0006\u0006\b\u009e\u0002\u0010\u0097\u0003J3\u0010õ\u0001\u001a\u00030ô\u00012\u0007\u0010Y\u001a\u00030ñ\u00012\u000e\u0010\u0099\u0003\u001a\t\u0012\u0005\u0012\u00030\u0098\u0003022\u0007\u0010\b\u001a\u00030ó\u0001¢\u0006\u0006\bõ\u0001\u0010\u009a\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010\u009b\u0003\u001a\u0006\b\u009c\u0003\u0010\u009d\u0003R/\u0010\u009e\u0003\u001a\u0002042\u0006\u0010J\u001a\u0002048\u0000@@X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009e\u0003\u0010\u009f\u0003\u001a\u0005\b \u0003\u0010|\"\u0005\b¡\u0003\u00107R&\u0010£\u0003\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060¢\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0003\u0010¤\u0003R\u0018\u0010¦\u0003\u001a\u00030¥\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0003\u0010§\u0003¨\u0006¨\u0003"}, d2 = {"Lcom/mapbox/maps/NativeMapImpl;", "", "Lcom/mapbox/maps/Map;", "map", "<init>", "(Lcom/mapbox/maps/Map;)V", "Lkotlin/Function0;", "", "callback", "whenMapSizeReady", "(Le23/a;)V", "Lcom/mapbox/maps/Size;", "size", "setSize", "(Lcom/mapbox/maps/Size;)V", "getSize", "()Lcom/mapbox/maps/Size;", "createRenderer", "()V", "destroyRenderer", "render", "resetThreadServiceType", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "setCamera", "(Lcom/mapbox/maps/CameraOptions;)V", "Lcom/mapbox/maps/CameraState;", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "", "Lcom/mapbox/maps/ScreenCoordinate;", "pixels", "Lcom/mapbox/geojson/Point;", "coordinatesForPixels", "(Ljava/util/List;)Ljava/util/List;", "Lcom/mapbox/maps/CoordinateBounds;", "coordinateBounds", "Lcom/mapbox/maps/EdgeInsets;", "padding", "", "bearing", "pitch", "maxZoom", MapboxMap.QFE_OFFSET, "cameraForCoordinateBounds", "(Lcom/mapbox/maps/CoordinateBounds;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "pixel", "Lcom/mapbox/maps/CoordinateInfo;", "coordinateInfoForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CoordinateInfo;", "", "coordinatesInfoForPixels", "", "inProgress", "setUserAnimationInProgress", "(Z)V", "Lcom/mapbox/maps/CameraAnimationHint;", "cameraAnimationHint", "setCameraAnimationHint", "(Lcom/mapbox/maps/CameraAnimationHint;)V", "", "sourceId", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "invalidateStyleCustomGeometrySourceRegion", "(Ljava/lang/String;Lcom/mapbox/maps/CoordinateBounds;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/Value;", "properties", "setStyleTerrain", "(Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "property", "Lcom/mapbox/maps/StylePropertyValue;", "getStyleTerrainProperty", "(Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "value", "setStyleTerrainProperty", "(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "setStyleProjection", "getStyleProjectionProperty", "setStyleProjectionProperty", "points", "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "camera", "Lcom/mapbox/maps/ScreenBox;", "box", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/ScreenBox;)Lcom/mapbox/maps/CameraOptions;", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/geojson/Geometry;", "geometry", "cameraForGeometry", "(Lcom/mapbox/geojson/Geometry;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Ljava/lang/Double;)Lcom/mapbox/maps/CameraOptions;", "point", "getElevation", "(Lcom/mapbox/geojson/Point;)Ljava/lang/Double;", "Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setViewAnnotationPositionsUpdateListener", "(Lcom/mapbox/maps/ViewAnnotationPositionsUpdateListener;)V", "identifier", "Lcom/mapbox/maps/ViewAnnotationOptions;", "options", "addViewAnnotation", "(Ljava/lang/String;Lcom/mapbox/maps/ViewAnnotationOptions;)Lcom/mapbox/bindgen/Expected;", "updateViewAnnotation", "removeViewAnnotation", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "getViewAnnotationOptions", "Lcom/mapbox/maps/TileCoverOptions;", "tileCoverOptions", "Lcom/mapbox/maps/CanonicalTileID;", "tileCover", "(Lcom/mapbox/maps/TileCoverOptions;Lcom/mapbox/maps/CameraOptions;)Ljava/util/List;", "coordinateBoundsForCamera", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBounds;", "coordinateBoundsForCameraUnwrapped", "Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinateBoundsZoomForCameraUnwrapped", "(Lcom/mapbox/maps/CameraOptions;)Lcom/mapbox/maps/CoordinateBoundsZoom;", "coordinates", "pixelsForCoordinates", "gestureInProgress", "setGestureInProgress", "isGestureInProgress", "()Z", "Lcom/mapbox/maps/CameraBoundsOptions;", "boundOptions", "setBounds", "(Lcom/mapbox/maps/CameraBoundsOptions;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CameraBounds;", "getBounds", "()Lcom/mapbox/maps/CameraBounds;", "", "zoomDelta", "setPrefetchZoomDelta", "(B)V", "getPrefetchZoomDelta", "()B", "Lcom/mapbox/maps/NorthOrientation;", "northOrientation", "setNorthOrientation", "(Lcom/mapbox/maps/NorthOrientation;)V", "Lcom/mapbox/maps/ConstrainMode;", "constrainMode", "setConstrainMode", "(Lcom/mapbox/maps/ConstrainMode;)V", "Lcom/mapbox/maps/ViewportMode;", "viewportMode", "setViewportMode", "(Lcom/mapbox/maps/ViewportMode;)V", "Lcom/mapbox/maps/MapOptions;", "getMapOptions", "()Lcom/mapbox/maps/MapOptions;", "triggerRepaint", "layerId", "setStyleLayerProperty", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;)Lcom/mapbox/bindgen/Expected;", "pixelForCoordinate", "(Lcom/mapbox/geojson/Point;)Lcom/mapbox/maps/ScreenCoordinate;", "screenCoordinate", "coordinateForPixel", "(Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/geojson/Point;", "Lcom/mapbox/maps/MapDebugOptions;", "getDebug", "()Ljava/util/List;", "list", "debugActive", "setDebug", "(Ljava/util/List;Z)V", "parameters", "Lcom/mapbox/maps/LayerPosition;", "layerPosition", "addStyleLayer", "(Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/maps/CustomLayerHost;", "layerHost", "addStyleCustomLayer", "(Ljava/lang/String;Lcom/mapbox/maps/CustomLayerHost;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "addPersistentStyleLayer", "addPersistentStyleCustomLayer", "isStyleLayerPersistent", "moveStyleLayer", "(Ljava/lang/String;Lcom/mapbox/maps/LayerPosition;)Lcom/mapbox/bindgen/Expected;", "json", "setStyleJSON", "(Ljava/lang/String;)V", "getStyleJSON", "()Ljava/lang/String;", "getStyleURI", "uri", "setStyleURI", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/TransitionOptions;", "getStyleTransition", "()Lcom/mapbox/maps/TransitionOptions;", "transitionOptions", "setStyleTransition", "(Lcom/mapbox/maps/TransitionOptions;)V", "removeStyleLayer", "styleLayerExists", "(Ljava/lang/String;)Z", "getStyleLayerProperty", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/maps/StylePropertyValue;", "setStyleLayerProperties", "source", "addStyleSource", "getStyleSourceProperties", "Lcom/mapbox/maps/Image;", "image", "updateStyleImageSourceImage", "(Ljava/lang/String;Lcom/mapbox/maps/Image;)Lcom/mapbox/bindgen/Expected;", "getStyleLayerProperties", "removeStyleSource", "tileId", "Lcom/mapbox/geojson/Feature;", "featureCollection", "setStyleCustomGeometrySourceTileData", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;Ljava/util/List;)Lcom/mapbox/bindgen/Expected;", "styleSourceExists", TtmlNode.ATTR_ID, "setStyleLightProperty", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleLights", "lights", "setStyleLights", "setStyleAtmosphere", "getStyleAtmosphereProperty", "setStyleAtmosphereProperty", "getStyleLightProperty", "imageId", "getStyleImage", "(Ljava/lang/String;)Lcom/mapbox/maps/Image;", "removeStyleImage", "hasStyleImage", "modelId", "modelUri", "addStyleModel", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "removeStyleModel", "hasStyleModel", "Lcom/mapbox/maps/RenderedQueryGeometry;", "Lcom/mapbox/maps/RenderedQueryOptions;", "Lcom/mapbox/maps/QueryRenderedFeaturesCallback;", "Lcom/mapbox/common/Cancelable;", "queryRenderedFeatures", "(Lcom/mapbox/maps/RenderedQueryGeometry;Lcom/mapbox/maps/RenderedQueryOptions;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceQueryOptions;", "Lcom/mapbox/maps/QuerySourceFeaturesCallback;", "querySourceFeatures", "(Ljava/lang/String;Lcom/mapbox/maps/SourceQueryOptions;Lcom/mapbox/maps/QuerySourceFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "sourceIdentifier", "feature", "extension", "extensionField", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "args", "Lcom/mapbox/maps/QueryFeatureExtensionCallback;", "queryFeatureExtensions", "(Ljava/lang/String;Lcom/mapbox/geojson/Feature;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Lcom/mapbox/maps/QueryFeatureExtensionCallback;)Lcom/mapbox/common/Cancelable;", "sourceLayerId", "featureId", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/maps/FeatureStateOperationCallback;", "setFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/QueryFeatureStateCallback;", "getFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/FreeCameraOptions;", "getFreeCameraOptions", "()Lcom/mapbox/maps/FreeCameraOptions;", "freeCameraOptions", "(Lcom/mapbox/maps/FreeCameraOptions;)V", "invalidateStyleCustomGeometrySourceTile", "(Ljava/lang/String;Lcom/mapbox/maps/CanonicalTileID;)Lcom/mapbox/bindgen/Expected;", "setStyleSourceProperties", "dataId", "Lcom/mapbox/maps/GeoJSONSourceData;", "data", "setStyleGeoJSONSourceData", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/GeoJSONSourceData;)Lcom/mapbox/bindgen/Expected;", "stateKey", "removeFeatureState", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "resetFeatureStates", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/TileCacheBudget;", "tileCacheBudget", "setTileCacheBudget", "(Lcom/mapbox/maps/TileCacheBudget;)V", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "addStyleCustomGeometrySource", "(Ljava/lang/String;Lcom/mapbox/maps/CustomGeometrySourceOptions;)Lcom/mapbox/bindgen/Expected;", "", "scale", "sdf", "Lcom/mapbox/maps/ImageStretches;", "stretchX", "stretchY", "Lcom/mapbox/maps/ImageContent;", FirebaseAnalytics.Param.CONTENT, "addStyleImage", "(Ljava/lang/String;FLcom/mapbox/maps/Image;ZLjava/util/List;Ljava/util/List;Lcom/mapbox/maps/ImageContent;)Lcom/mapbox/bindgen/Expected;", "reduceMemoryUse", "isUserAnimationInProgress", "getStyleSourceProperty", "isStyleLoaded", "setStyleSourceProperty", "coordinateBoundsZoomForCamera", "getStyleLayers", "getStyleSources", "renderWorldCopies", "setRenderWorldCopies", "getRenderWorldCopies", "Lcom/mapbox/maps/MapLoadedCallback;", "mapLoadedCallback", "subscribe", "(Lcom/mapbox/maps/MapLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapIdleCallback;", "onMapIdleListener", "(Lcom/mapbox/maps/MapIdleCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/MapLoadingErrorCallback;", "mapLoadingErrorCallback", "(Lcom/mapbox/maps/MapLoadingErrorCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleLoadedCallback;", "styleLoadedCallback", "(Lcom/mapbox/maps/StyleLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleDataLoadedCallback;", "styleDataLoadedCallback", "(Lcom/mapbox/maps/StyleDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceDataLoadedCallback;", "sourceDataLoadedCallback", "(Lcom/mapbox/maps/SourceDataLoadedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceAddedCallback;", "sourceAddedCallback", "(Lcom/mapbox/maps/SourceAddedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/SourceRemovedCallback;", "sourceRemovedCallback", "(Lcom/mapbox/maps/SourceRemovedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageMissingCallback;", "styleImageMissingCallback", "(Lcom/mapbox/maps/StyleImageMissingCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;", "styleImageRemoveUnusedCallback", "(Lcom/mapbox/maps/StyleImageRemoveUnusedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCallback;", "cameraChangedCallback", "(Lcom/mapbox/maps/CameraChangedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "(Lcom/mapbox/maps/CameraChangedCoalescedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameStartedCallback;", "renderFrameStartedCallback", "(Lcom/mapbox/maps/RenderFrameStartedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/RenderFrameFinishedCallback;", "renderFrameFinishedCallback", "(Lcom/mapbox/maps/RenderFrameFinishedCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/ResourceRequestCallback;", "resourceRequestCallback", "(Lcom/mapbox/maps/ResourceRequestCallback;)Lcom/mapbox/common/Cancelable;", "eventName", "Lcom/mapbox/maps/GenericEventCallback;", "onGenericEventsListener", "(Ljava/lang/String;Lcom/mapbox/maps/GenericEventCallback;)Lcom/mapbox/common/Cancelable;", "getAttributions", "fromPoint", "toPoint", "cameraForDrag", "(Lcom/mapbox/maps/ScreenCoordinate;Lcom/mapbox/maps/ScreenCoordinate;)Lcom/mapbox/maps/CameraOptions;", "Lcom/mapbox/maps/MapCenterAltitudeMode;", "mode", "setCenterAltitudeMode", "(Lcom/mapbox/maps/MapCenterAltitudeMode;)V", "getCenterAltitudeMode", "()Lcom/mapbox/maps/MapCenterAltitudeMode;", "Lcom/mapbox/maps/Vec2;", "shape", "setScreenCullingShape", "(Ljava/util/List;)V", "getScreenCullingShape", "Lcom/mapbox/maps/PerformanceStatisticsOptions;", "Lcom/mapbox/maps/PerformanceStatisticsCallback;", "startPerformanceStatisticsCollection", "(Lcom/mapbox/maps/PerformanceStatisticsOptions;Lcom/mapbox/maps/PerformanceStatisticsCallback;)V", "stopPerformanceStatisticsCollection", "Ljava/util/HashSet;", "layerIds", "setViewAnnotationAvoidLayers", "(Ljava/util/HashSet;)Lcom/mapbox/bindgen/Expected;", "getViewAnnotationAvoidLayers", "()Ljava/util/HashSet;", "Lcom/mapbox/maps/Interaction;", "interaction", "addInteraction", "(Lcom/mapbox/maps/Interaction;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/PlatformEventInfo;", "platformEventInfo", "dispatch", "(Lcom/mapbox/maps/PlatformEventInfo;)V", "Lcom/mapbox/maps/FeaturesetDescriptor;", "featureset", "Lcom/mapbox/maps/FeaturesetFeatureId;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/bindgen/Value;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Lcom/mapbox/maps/QueryFeatureStateCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeaturesetFeatureId;Ljava/lang/String;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "(Lcom/mapbox/maps/FeaturesetDescriptor;Lcom/mapbox/maps/FeatureStateOperationCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/FeaturesetQueryTarget;", "targets", "(Lcom/mapbox/maps/RenderedQueryGeometry;Ljava/util/List;Lcom/mapbox/maps/QueryRenderedFeaturesCallback;)Lcom/mapbox/common/Cancelable;", "Lcom/mapbox/maps/Map;", "getMap", "()Lcom/mapbox/maps/Map;", "sizeSet", "Z", "getSizeSet$maps_sdk_release", "setSizeSet$maps_sdk_release", "Ljava/util/concurrent/CopyOnWriteArrayList;", "sizeSetCallbackList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NativeMapImpl {
    private final Handler mainHandler;
    private final Map map;
    private volatile boolean sizeSet;
    private CopyOnWriteArrayList<e23.a<Unit>> sizeSetCallbackList;

    public NativeMapImpl(Map map) {
        map.getClass();
        this.map = map;
        this.sizeSetCallbackList = new CopyOnWriteArrayList<>();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_sizeSet_$lambda$1(NativeMapImpl nativeMapImpl) {
        nativeMapImpl.getClass();
        if (nativeMapImpl.sizeSet) {
            Iterator<T> it = nativeMapImpl.sizeSetCallbackList.iterator();
            while (it.hasNext()) {
                ((e23.a) it.next()).invoke();
            }
            nativeMapImpl.sizeSetCallbackList.clear();
        }
    }

    public final Cancelable addInteraction(Interaction interaction) {
        interaction.getClass();
        Cancelable cancelableAddInteraction = this.map.addInteraction(interaction);
        cancelableAddInteraction.getClass();
        return cancelableAddInteraction;
    }

    public final Expected<String, None> addPersistentStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        layerId.getClass();
        layerHost.getClass();
        Expected<String, None> expectedAddPersistentStyleCustomLayer = this.map.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
        expectedAddPersistentStyleCustomLayer.getClass();
        return expectedAddPersistentStyleCustomLayer;
    }

    public final Expected<String, None> addPersistentStyleLayer(Value properties, LayerPosition layerPosition) {
        properties.getClass();
        Expected<String, None> expectedAddPersistentStyleLayer = this.map.addPersistentStyleLayer(properties, layerPosition);
        expectedAddPersistentStyleLayer.getClass();
        return expectedAddPersistentStyleLayer;
    }

    public final Expected<String, None> addStyleCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
        sourceId.getClass();
        options.getClass();
        Expected<String, None> expectedAddStyleCustomGeometrySource = this.map.addStyleCustomGeometrySource(sourceId, options);
        expectedAddStyleCustomGeometrySource.getClass();
        return expectedAddStyleCustomGeometrySource;
    }

    public final Expected<String, None> addStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        layerId.getClass();
        layerHost.getClass();
        Expected<String, None> expectedAddStyleCustomLayer = this.map.addStyleCustomLayer(layerId, layerHost, layerPosition);
        expectedAddStyleCustomLayer.getClass();
        return expectedAddStyleCustomLayer;
    }

    public final Expected<String, None> addStyleImage(String imageId, float scale, Image image, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        imageId.getClass();
        image.getClass();
        stretchX.getClass();
        stretchY.getClass();
        Expected<String, None> expectedAddStyleImage = this.map.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
        expectedAddStyleImage.getClass();
        return expectedAddStyleImage;
    }

    public final Expected<String, None> addStyleLayer(Value parameters, LayerPosition layerPosition) {
        parameters.getClass();
        Expected<String, None> expectedAddStyleLayer = this.map.addStyleLayer(parameters, layerPosition);
        expectedAddStyleLayer.getClass();
        return expectedAddStyleLayer;
    }

    public final Expected<String, None> addStyleModel(String modelId, String modelUri) {
        modelId.getClass();
        modelUri.getClass();
        Expected<String, None> expectedAddStyleModel = this.map.addStyleModel(modelId, modelUri);
        expectedAddStyleModel.getClass();
        return expectedAddStyleModel;
    }

    public final Expected<String, None> addStyleSource(String sourceId, Value source) {
        sourceId.getClass();
        source.getClass();
        Expected<String, None> expectedAddStyleSource = this.map.addStyleSource(sourceId, source);
        expectedAddStyleSource.getClass();
        return expectedAddStyleSource;
    }

    public final Expected<String, None> addViewAnnotation(String identifier, ViewAnnotationOptions options) {
        identifier.getClass();
        options.getClass();
        Expected<String, None> expectedAddViewAnnotation = this.map.addViewAnnotation(identifier, options);
        expectedAddViewAnnotation.getClass();
        return expectedAddViewAnnotation;
    }

    public final CameraOptions cameraForCoordinateBounds(CoordinateBounds coordinateBounds, EdgeInsets padding, Double bearing, Double pitch, Double maxZoom, ScreenCoordinate offset) {
        coordinateBounds.getClass();
        CameraOptions cameraOptionsCameraForCoordinateBounds = this.map.cameraForCoordinateBounds(coordinateBounds, padding, bearing, pitch, maxZoom, offset);
        cameraOptionsCameraForCoordinateBounds.getClass();
        return cameraOptionsCameraForCoordinateBounds;
    }

    public final Expected<String, CameraOptions> cameraForCoordinates(List<Point> points, CameraOptions camera, EdgeInsets padding, Double maxZoom, ScreenCoordinate offset) {
        points.getClass();
        camera.getClass();
        Expected<String, CameraOptions> expectedCameraForCoordinates = this.map.cameraForCoordinates(points, camera, padding, maxZoom, offset);
        expectedCameraForCoordinates.getClass();
        return expectedCameraForCoordinates;
    }

    public final CameraOptions cameraForDrag(ScreenCoordinate fromPoint, ScreenCoordinate toPoint) {
        fromPoint.getClass();
        toPoint.getClass();
        CameraOptions cameraOptionsCameraForDrag = this.map.cameraForDrag(fromPoint, toPoint);
        cameraOptionsCameraForDrag.getClass();
        return cameraOptionsCameraForDrag;
    }

    public final CameraOptions cameraForGeometry(Geometry geometry, EdgeInsets padding, Double bearing, Double pitch) {
        geometry.getClass();
        CameraOptions cameraOptionsCameraForGeometry = this.map.cameraForGeometry(geometry, padding, bearing, pitch);
        cameraOptionsCameraForGeometry.getClass();
        return cameraOptionsCameraForGeometry;
    }

    public final CoordinateBounds coordinateBoundsForCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = this.map.coordinateBoundsForCamera(cameraOptions);
        coordinateBoundsCoordinateBoundsForCamera.getClass();
        return coordinateBoundsCoordinateBoundsForCamera;
    }

    public final CoordinateBounds coordinateBoundsForCameraUnwrapped(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBounds coordinateBoundsCoordinateBoundsForCameraUnwrapped = this.map.coordinateBoundsForCameraUnwrapped(cameraOptions);
        coordinateBoundsCoordinateBoundsForCameraUnwrapped.getClass();
        return coordinateBoundsCoordinateBoundsForCameraUnwrapped;
    }

    public final CoordinateBoundsZoom coordinateBoundsZoomForCamera(CameraOptions camera) {
        camera.getClass();
        CoordinateBoundsZoom coordinateBoundsZoomCoordinateBoundsZoomForCamera = this.map.coordinateBoundsZoomForCamera(camera);
        coordinateBoundsZoomCoordinateBoundsZoomForCamera.getClass();
        return coordinateBoundsZoomCoordinateBoundsZoomForCamera;
    }

    public final CoordinateBoundsZoom coordinateBoundsZoomForCameraUnwrapped(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBoundsZoom coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped = this.map.coordinateBoundsZoomForCameraUnwrapped(cameraOptions);
        coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped.getClass();
        return coordinateBoundsZoomCoordinateBoundsZoomForCameraUnwrapped;
    }

    public final Point coordinateForPixel(ScreenCoordinate screenCoordinate) {
        screenCoordinate.getClass();
        Point pointCoordinateForPixel = this.map.coordinateForPixel(screenCoordinate);
        pointCoordinateForPixel.getClass();
        return pointCoordinateForPixel;
    }

    public final CoordinateInfo coordinateInfoForPixel(ScreenCoordinate pixel) {
        pixel.getClass();
        CoordinateInfo coordinateInfoCoordinateInfoForPixel = this.map.coordinateInfoForPixel(pixel);
        coordinateInfoCoordinateInfoForPixel.getClass();
        return coordinateInfoCoordinateInfoForPixel;
    }

    public final List<Point> coordinatesForPixels(List<ScreenCoordinate> pixels) {
        pixels.getClass();
        List<Point> listCoordinatesForPixels = this.map.coordinatesForPixels(pixels);
        listCoordinatesForPixels.getClass();
        return listCoordinatesForPixels;
    }

    public final List<CoordinateInfo> coordinatesInfoForPixels(List<ScreenCoordinate> pixels) {
        pixels.getClass();
        List<CoordinateInfo> listCoordinatesInfoForPixels = this.map.coordinatesInfoForPixels(pixels);
        listCoordinatesInfoForPixels.getClass();
        return listCoordinatesInfoForPixels;
    }

    public final void createRenderer() {
        this.map.createRenderer();
    }

    public final void destroyRenderer() {
        this.map.destroyRenderer();
    }

    public final void dispatch(PlatformEventInfo platformEventInfo) {
        platformEventInfo.getClass();
        this.map.dispatch(platformEventInfo);
    }

    public final List<String> getAttributions() {
        List<String> attributions = this.map.getAttributions();
        attributions.getClass();
        return attributions;
    }

    public final CameraBounds getBounds() {
        CameraBounds bounds = this.map.getBounds();
        bounds.getClass();
        return bounds;
    }

    public final CameraState getCameraState() {
        CameraState cameraState = this.map.getCameraState();
        cameraState.getClass();
        return cameraState;
    }

    public final MapCenterAltitudeMode getCenterAltitudeMode() {
        MapCenterAltitudeMode centerAltitudeMode = this.map.getCenterAltitudeMode();
        centerAltitudeMode.getClass();
        return centerAltitudeMode;
    }

    public final List<MapDebugOptions> getDebug() {
        List<MapDebugOptions> debug = this.map.getDebug();
        debug.getClass();
        return debug;
    }

    public final Double getElevation(Point point) {
        point.getClass();
        return this.map.getElevation(point);
    }

    public final Cancelable getFeatureState(String sourceId, String sourceLayerId, String featureId, QueryFeatureStateCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        callback.getClass();
        Cancelable featureState = this.map.getFeatureState(sourceId, sourceLayerId, featureId, callback);
        featureState.getClass();
        return featureState;
    }

    public final FreeCameraOptions getFreeCameraOptions() {
        FreeCameraOptions freeCameraOptions = this.map.getFreeCameraOptions();
        freeCameraOptions.getClass();
        return freeCameraOptions;
    }

    public final Map getMap() {
        return this.map;
    }

    public final MapOptions getMapOptions() {
        MapOptions mapOptions = this.map.getMapOptions();
        mapOptions.getClass();
        return mapOptions;
    }

    public final byte getPrefetchZoomDelta() {
        return this.map.getPrefetchZoomDelta();
    }

    public final boolean getRenderWorldCopies() {
        return this.map.getRenderWorldCopies();
    }

    public final List<Vec2> getScreenCullingShape() {
        List<Vec2> screenCullingShape = this.map.getScreenCullingShape();
        screenCullingShape.getClass();
        return screenCullingShape;
    }

    public final Size getSize() {
        Size size = this.map.getSize();
        size.getClass();
        return size;
    }

    /* JADX INFO: renamed from: getSizeSet$maps_sdk_release, reason: from getter */
    public final boolean getSizeSet() {
        return this.sizeSet;
    }

    public final StylePropertyValue getStyleAtmosphereProperty(String property) {
        property.getClass();
        StylePropertyValue styleAtmosphereProperty = this.map.getStyleAtmosphereProperty(property);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    public final CameraOptions getStyleDefaultCamera() {
        CameraOptions styleDefaultCamera = this.map.getStyleDefaultCamera();
        styleDefaultCamera.getClass();
        return styleDefaultCamera;
    }

    public final Image getStyleImage(String imageId) {
        imageId.getClass();
        return this.map.getStyleImage(imageId);
    }

    public final String getStyleJSON() {
        String styleJSON = this.map.getStyleJSON();
        styleJSON.getClass();
        return styleJSON;
    }

    public final Expected<String, Value> getStyleLayerProperties(String layerId) {
        layerId.getClass();
        Expected<String, Value> styleLayerProperties = this.map.getStyleLayerProperties(layerId);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    public final StylePropertyValue getStyleLayerProperty(String layerId, String property) {
        layerId.getClass();
        property.getClass();
        StylePropertyValue styleLayerProperty = this.map.getStyleLayerProperty(layerId, property);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    public final List<StyleObjectInfo> getStyleLayers() {
        List<StyleObjectInfo> styleLayers = this.map.getStyleLayers();
        styleLayers.getClass();
        return styleLayers;
    }

    public final StylePropertyValue getStyleLightProperty(String id3, String property) {
        id3.getClass();
        property.getClass();
        StylePropertyValue styleLightProperty = this.map.getStyleLightProperty(id3, property);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public final List<StyleObjectInfo> getStyleLights() {
        List<StyleObjectInfo> styleLights = this.map.getStyleLights();
        styleLights.getClass();
        return styleLights;
    }

    public final StylePropertyValue getStyleProjectionProperty(String property) {
        property.getClass();
        StylePropertyValue styleProjectionProperty = this.map.getStyleProjectionProperty(property);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    public final Expected<String, Value> getStyleSourceProperties(String sourceId) {
        sourceId.getClass();
        Expected<String, Value> styleSourceProperties = this.map.getStyleSourceProperties(sourceId);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    public final StylePropertyValue getStyleSourceProperty(String sourceId, String property) {
        sourceId.getClass();
        property.getClass();
        StylePropertyValue styleSourceProperty = this.map.getStyleSourceProperty(sourceId, property);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public final List<StyleObjectInfo> getStyleSources() {
        List<StyleObjectInfo> styleSources = this.map.getStyleSources();
        styleSources.getClass();
        return styleSources;
    }

    public final StylePropertyValue getStyleTerrainProperty(String property) {
        property.getClass();
        StylePropertyValue styleTerrainProperty = this.map.getStyleTerrainProperty(property);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public final TransitionOptions getStyleTransition() {
        TransitionOptions styleTransition = this.map.getStyleTransition();
        styleTransition.getClass();
        return styleTransition;
    }

    public final String getStyleURI() {
        String styleURI = this.map.getStyleURI();
        styleURI.getClass();
        return styleURI;
    }

    public final HashSet<String> getViewAnnotationAvoidLayers() {
        HashSet<String> viewAnnotationAvoidLayers = this.map.getViewAnnotationAvoidLayers();
        viewAnnotationAvoidLayers.getClass();
        return viewAnnotationAvoidLayers;
    }

    public final Expected<String, ViewAnnotationOptions> getViewAnnotationOptions(String identifier) {
        identifier.getClass();
        Expected<String, ViewAnnotationOptions> viewAnnotationOptions = this.map.getViewAnnotationOptions(identifier);
        viewAnnotationOptions.getClass();
        return viewAnnotationOptions;
    }

    public final boolean hasStyleImage(String imageId) {
        imageId.getClass();
        return this.map.hasStyleImage(imageId);
    }

    public final boolean hasStyleModel(String modelId) {
        modelId.getClass();
        return this.map.hasStyleModel(modelId);
    }

    public final Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String sourceId, CoordinateBounds coordinateBounds) {
        sourceId.getClass();
        coordinateBounds.getClass();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceRegion = this.map.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
        expectedInvalidateStyleCustomGeometrySourceRegion.getClass();
        return expectedInvalidateStyleCustomGeometrySourceRegion;
    }

    public final Expected<String, None> invalidateStyleCustomGeometrySourceTile(String sourceId, CanonicalTileID tileId) {
        sourceId.getClass();
        tileId.getClass();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceTile = this.map.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
        expectedInvalidateStyleCustomGeometrySourceTile.getClass();
        return expectedInvalidateStyleCustomGeometrySourceTile;
    }

    public final boolean isGestureInProgress() {
        return this.map.isGestureInProgress();
    }

    public final Expected<String, Boolean> isStyleLayerPersistent(String layerId) {
        layerId.getClass();
        Expected<String, Boolean> expectedIsStyleLayerPersistent = this.map.isStyleLayerPersistent(layerId);
        expectedIsStyleLayerPersistent.getClass();
        return expectedIsStyleLayerPersistent;
    }

    public final boolean isStyleLoaded() {
        return this.map.isStyleLoaded();
    }

    public final boolean isUserAnimationInProgress() {
        return this.map.isUserAnimationInProgress();
    }

    public final Expected<String, None> moveStyleLayer(String layerId, LayerPosition layerPosition) {
        layerId.getClass();
        Expected<String, None> expectedMoveStyleLayer = this.map.moveStyleLayer(layerId, layerPosition);
        expectedMoveStyleLayer.getClass();
        return expectedMoveStyleLayer;
    }

    public final ScreenCoordinate pixelForCoordinate(Point pixel) {
        pixel.getClass();
        ScreenCoordinate screenCoordinatePixelForCoordinate = this.map.pixelForCoordinate(pixel);
        screenCoordinatePixelForCoordinate.getClass();
        return screenCoordinatePixelForCoordinate;
    }

    public final List<ScreenCoordinate> pixelsForCoordinates(List<Point> coordinates) {
        coordinates.getClass();
        List<ScreenCoordinate> listPixelsForCoordinates = this.map.pixelsForCoordinates(coordinates);
        listPixelsForCoordinates.getClass();
        return listPixelsForCoordinates;
    }

    public final Cancelable queryFeatureExtensions(String sourceIdentifier, Feature feature, String extension, String extensionField, HashMap<String, Value> args, QueryFeatureExtensionCallback callback) {
        sourceIdentifier.getClass();
        feature.getClass();
        extension.getClass();
        extensionField.getClass();
        callback.getClass();
        Cancelable cancelableQueryFeatureExtensions = this.map.queryFeatureExtensions(sourceIdentifier, feature, extension, extensionField, args, callback);
        cancelableQueryFeatureExtensions.getClass();
        return cancelableQueryFeatureExtensions;
    }

    public final Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, RenderedQueryOptions options, QueryRenderedFeaturesCallback callback) {
        geometry.getClass();
        options.getClass();
        callback.getClass();
        Cancelable cancelableQueryRenderedFeatures = this.map.queryRenderedFeatures(geometry, options, callback);
        cancelableQueryRenderedFeatures.getClass();
        return cancelableQueryRenderedFeatures;
    }

    public final Cancelable querySourceFeatures(String sourceId, SourceQueryOptions options, QuerySourceFeaturesCallback callback) {
        sourceId.getClass();
        options.getClass();
        callback.getClass();
        Cancelable cancelableQuerySourceFeatures = this.map.querySourceFeatures(sourceId, options, callback);
        cancelableQuerySourceFeatures.getClass();
        return cancelableQuerySourceFeatures;
    }

    public final void reduceMemoryUse() {
        this.map.reduceMemoryUse();
    }

    public final Cancelable removeFeatureState(String sourceId, String sourceLayerId, String featureId, String stateKey, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        callback.getClass();
        Cancelable cancelableRemoveFeatureState = this.map.removeFeatureState(sourceId, sourceLayerId, featureId, stateKey, callback);
        cancelableRemoveFeatureState.getClass();
        return cancelableRemoveFeatureState;
    }

    public final Expected<String, None> removeStyleImage(String imageId) {
        imageId.getClass();
        Expected<String, None> expectedRemoveStyleImage = this.map.removeStyleImage(imageId);
        expectedRemoveStyleImage.getClass();
        return expectedRemoveStyleImage;
    }

    public final Expected<String, None> removeStyleLayer(String layerId) {
        layerId.getClass();
        Expected<String, None> expectedRemoveStyleLayer = this.map.removeStyleLayer(layerId);
        expectedRemoveStyleLayer.getClass();
        return expectedRemoveStyleLayer;
    }

    public final Expected<String, None> removeStyleModel(String modelId) {
        modelId.getClass();
        Expected<String, None> expectedRemoveStyleModel = this.map.removeStyleModel(modelId);
        expectedRemoveStyleModel.getClass();
        return expectedRemoveStyleModel;
    }

    public final Expected<String, None> removeStyleSource(String sourceId) {
        sourceId.getClass();
        Expected<String, None> expectedRemoveStyleSource = this.map.removeStyleSource(sourceId);
        expectedRemoveStyleSource.getClass();
        return expectedRemoveStyleSource;
    }

    public final Expected<String, None> removeViewAnnotation(String identifier) {
        identifier.getClass();
        Expected<String, None> expectedRemoveViewAnnotation = this.map.removeViewAnnotation(identifier);
        expectedRemoveViewAnnotation.getClass();
        return expectedRemoveViewAnnotation;
    }

    public final void render() {
        this.map.render();
    }

    public final Cancelable resetFeatureStates(String sourceId, String sourceLayerId, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        callback.getClass();
        Cancelable cancelableResetFeatureStates = this.map.resetFeatureStates(sourceId, sourceLayerId, callback);
        cancelableResetFeatureStates.getClass();
        return cancelableResetFeatureStates;
    }

    @MapboxExperimental
    public final void resetThreadServiceType() {
        this.map.resetThreadServiceType();
    }

    public final Expected<String, None> setBounds(CameraBoundsOptions boundOptions) {
        boundOptions.getClass();
        Expected<String, None> bounds = this.map.setBounds(boundOptions);
        bounds.getClass();
        return bounds;
    }

    public final void setCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        this.map.setCamera(cameraOptions);
    }

    @MapboxExperimental
    public final void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint) {
        cameraAnimationHint.getClass();
        this.map.setCameraAnimationHint(cameraAnimationHint);
    }

    public final void setCenterAltitudeMode(MapCenterAltitudeMode mode) {
        mode.getClass();
        this.map.setCenterAltitudeMode(mode);
    }

    public final void setConstrainMode(ConstrainMode constrainMode) {
        constrainMode.getClass();
        this.map.setConstrainMode(constrainMode);
    }

    public final void setDebug(List<? extends MapDebugOptions> list, boolean debugActive) {
        list.getClass();
        this.map.setDebug(list, debugActive);
    }

    public final Cancelable setFeatureState(String sourceId, String sourceLayerId, String featureId, Value state, FeatureStateOperationCallback callback) {
        sourceId.getClass();
        featureId.getClass();
        state.getClass();
        callback.getClass();
        Cancelable featureState = this.map.setFeatureState(sourceId, sourceLayerId, featureId, state, callback);
        featureState.getClass();
        return featureState;
    }

    public final void setGestureInProgress(boolean gestureInProgress) {
        this.map.setGestureInProgress(gestureInProgress);
    }

    public final void setNorthOrientation(NorthOrientation northOrientation) {
        northOrientation.getClass();
        this.map.setNorthOrientation(northOrientation);
    }

    public final void setPrefetchZoomDelta(byte zoomDelta) {
        this.map.setPrefetchZoomDelta(zoomDelta);
    }

    public final void setRenderWorldCopies(boolean renderWorldCopies) {
        this.map.setRenderWorldCopies(renderWorldCopies);
    }

    public final void setScreenCullingShape(List<Vec2> shape) {
        shape.getClass();
        this.map.setScreenCullingShape(shape);
    }

    public final void setSize(Size size) {
        size.getClass();
        this.map.setSize(size);
        setSizeSet$maps_sdk_release(true);
    }

    public final synchronized void setSizeSet$maps_sdk_release(boolean z14) {
        if (z14) {
            try {
                if (!this.sizeSet) {
                    if (s.g(Looper.myLooper(), Looper.getMainLooper())) {
                        Iterator<T> it = this.sizeSetCallbackList.iterator();
                        while (it.hasNext()) {
                            ((e23.a) it.next()).invoke();
                        }
                        this.sizeSetCallbackList.clear();
                    } else {
                        this.mainHandler.post(new h0(this, 20));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.sizeSet = z14;
    }

    public final Expected<String, None> setStyleAtmosphere(Value properties) {
        properties.getClass();
        Expected<String, None> styleAtmosphere = this.map.setStyleAtmosphere(properties);
        styleAtmosphere.getClass();
        return styleAtmosphere;
    }

    public final Expected<String, None> setStyleAtmosphereProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        Expected<String, None> styleAtmosphereProperty = this.map.setStyleAtmosphereProperty(property, value);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    public final Expected<String, None> setStyleCustomGeometrySourceTileData(String sourceId, CanonicalTileID tileId, List<Feature> featureCollection) {
        sourceId.getClass();
        tileId.getClass();
        featureCollection.getClass();
        Expected<String, None> styleCustomGeometrySourceTileData = this.map.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
        styleCustomGeometrySourceTileData.getClass();
        return styleCustomGeometrySourceTileData;
    }

    public final Expected<String, None> setStyleGeoJSONSourceData(String sourceId, String dataId, GeoJSONSourceData data) {
        sourceId.getClass();
        dataId.getClass();
        data.getClass();
        Expected<String, None> styleGeoJSONSourceData = this.map.setStyleGeoJSONSourceData(sourceId, dataId, data);
        styleGeoJSONSourceData.getClass();
        return styleGeoJSONSourceData;
    }

    public final void setStyleJSON(String json) {
        json.getClass();
        this.map.setStyleJSON(json);
    }

    public final Expected<String, None> setStyleLayerProperties(String layerId, Value properties) {
        layerId.getClass();
        properties.getClass();
        Expected<String, None> styleLayerProperties = this.map.setStyleLayerProperties(layerId, properties);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    public final Expected<String, None> setStyleLayerProperty(String layerId, String property, Value value) {
        layerId.getClass();
        property.getClass();
        value.getClass();
        Expected<String, None> styleLayerProperty = this.map.setStyleLayerProperty(layerId, property, value);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    public final Expected<String, None> setStyleLightProperty(String id3, String property, Value value) {
        id3.getClass();
        property.getClass();
        value.getClass();
        Expected<String, None> styleLightProperty = this.map.setStyleLightProperty(id3, property, value);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public final Expected<String, None> setStyleLights(Value lights) {
        lights.getClass();
        Expected<String, None> styleLights = this.map.setStyleLights(lights);
        styleLights.getClass();
        return styleLights;
    }

    public final Expected<String, None> setStyleProjection(Value properties) {
        properties.getClass();
        Expected<String, None> styleProjection = this.map.setStyleProjection(properties);
        styleProjection.getClass();
        return styleProjection;
    }

    public final Expected<String, None> setStyleProjectionProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        Expected<String, None> styleProjectionProperty = this.map.setStyleProjectionProperty(property, value);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    public final Expected<String, None> setStyleSourceProperties(String sourceId, Value properties) {
        sourceId.getClass();
        properties.getClass();
        Expected<String, None> styleSourceProperties = this.map.setStyleSourceProperties(sourceId, properties);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    public final Expected<String, None> setStyleSourceProperty(String sourceId, String property, Value value) {
        sourceId.getClass();
        property.getClass();
        value.getClass();
        Expected<String, None> styleSourceProperty = this.map.setStyleSourceProperty(sourceId, property, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public final Expected<String, None> setStyleTerrain(Value properties) {
        properties.getClass();
        Expected<String, None> styleTerrain = this.map.setStyleTerrain(properties);
        styleTerrain.getClass();
        return styleTerrain;
    }

    public final Expected<String, None> setStyleTerrainProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        Expected<String, None> styleTerrainProperty = this.map.setStyleTerrainProperty(property, value);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public final void setStyleTransition(TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        this.map.setStyleTransition(transitionOptions);
    }

    public final void setStyleURI(String uri) {
        uri.getClass();
        this.map.setStyleURI(uri);
    }

    public final void setTileCacheBudget(TileCacheBudget tileCacheBudget) {
        this.map.setTileCacheBudget(tileCacheBudget);
    }

    public final void setUserAnimationInProgress(boolean inProgress) {
        this.map.setUserAnimationInProgress(inProgress);
    }

    @MapboxExperimental
    public final Expected<String, None> setViewAnnotationAvoidLayers(HashSet<String> layerIds) {
        Expected<String, None> viewAnnotationAvoidLayers = this.map.setViewAnnotationAvoidLayers(layerIds);
        viewAnnotationAvoidLayers.getClass();
        return viewAnnotationAvoidLayers;
    }

    public final void setViewAnnotationPositionsUpdateListener(ViewAnnotationPositionsUpdateListener listener) {
        this.map.setViewAnnotationPositionsUpdateListener(listener);
    }

    public final void setViewportMode(ViewportMode viewportMode) {
        viewportMode.getClass();
        this.map.setViewportMode(viewportMode);
    }

    public final void startPerformanceStatisticsCollection(PerformanceStatisticsOptions options, PerformanceStatisticsCallback callback) {
        options.getClass();
        callback.getClass();
        this.map.startPerformanceStatisticsCollection(options, callback);
    }

    public final void stopPerformanceStatisticsCollection() {
        this.map.stopPerformanceStatisticsCollection();
    }

    public final boolean styleLayerExists(String layerId) {
        layerId.getClass();
        return this.map.styleLayerExists(layerId);
    }

    public final boolean styleSourceExists(String sourceId) {
        sourceId.getClass();
        return this.map.styleSourceExists(sourceId);
    }

    @MapboxExperimental
    public final Cancelable subscribe(String eventName, GenericEventCallback onGenericEventsListener) {
        eventName.getClass();
        onGenericEventsListener.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(eventName, onGenericEventsListener);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        tileCoverOptions.getClass();
        List<CanonicalTileID> listTileCover = this.map.tileCover(tileCoverOptions, cameraOptions);
        listTileCover.getClass();
        return listTileCover;
    }

    public final void triggerRepaint() {
        this.map.triggerRepaint();
    }

    public final Expected<String, None> updateStyleImageSourceImage(String sourceId, Image image) {
        sourceId.getClass();
        image.getClass();
        Expected<String, None> expectedUpdateStyleImageSourceImage = this.map.updateStyleImageSourceImage(sourceId, image);
        expectedUpdateStyleImageSourceImage.getClass();
        return expectedUpdateStyleImageSourceImage;
    }

    public final Expected<String, None> updateViewAnnotation(String identifier, ViewAnnotationOptions options) {
        identifier.getClass();
        options.getClass();
        Expected<String, None> expectedUpdateViewAnnotation = this.map.updateViewAnnotation(identifier, options);
        expectedUpdateViewAnnotation.getClass();
        return expectedUpdateViewAnnotation;
    }

    public final void whenMapSizeReady(e23.a<Unit> callback) {
        callback.getClass();
        if (this.sizeSet) {
            callback.invoke();
        } else {
            this.sizeSetCallbackList.add(callback);
        }
    }

    public final void setCamera(FreeCameraOptions freeCameraOptions) {
        freeCameraOptions.getClass();
        this.map.setCamera(freeCameraOptions);
    }

    public final Cancelable resetFeatureStates(FeaturesetDescriptor featureset, FeatureStateOperationCallback callback) {
        featureset.getClass();
        callback.getClass();
        Cancelable cancelableResetFeatureStates = this.map.resetFeatureStates(featureset, callback);
        cancelableResetFeatureStates.getClass();
        return cancelableResetFeatureStates;
    }

    public final Cancelable subscribe(MapIdleCallback onMapIdleListener) {
        onMapIdleListener.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(onMapIdleListener);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(MapLoadingErrorCallback mapLoadingErrorCallback) {
        mapLoadingErrorCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(mapLoadingErrorCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleLoadedCallback styleLoadedCallback) {
        styleLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable getFeatureState(FeaturesetDescriptor featureset, FeaturesetFeatureId featureId, QueryFeatureStateCallback callback) {
        featureset.getClass();
        featureId.getClass();
        callback.getClass();
        Cancelable featureState = this.map.getFeatureState(featureset, featureId, callback);
        featureState.getClass();
        return featureState;
    }

    public final Cancelable queryRenderedFeatures(RenderedQueryGeometry geometry, List<FeaturesetQueryTarget> targets, QueryRenderedFeaturesCallback callback) {
        geometry.getClass();
        targets.getClass();
        callback.getClass();
        Cancelable cancelableQueryRenderedFeatures = this.map.queryRenderedFeatures(geometry, targets, callback);
        cancelableQueryRenderedFeatures.getClass();
        return cancelableQueryRenderedFeatures;
    }

    public final Cancelable subscribe(StyleDataLoadedCallback styleDataLoadedCallback) {
        styleDataLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleDataLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(SourceDataLoadedCallback sourceDataLoadedCallback) {
        sourceDataLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(sourceDataLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final CameraOptions cameraForCoordinates(List<Point> points, CameraOptions camera, ScreenBox box) {
        points.getClass();
        camera.getClass();
        box.getClass();
        CameraOptions cameraOptionsCameraForCoordinates = this.map.cameraForCoordinates(points, camera, box);
        cameraOptionsCameraForCoordinates.getClass();
        return cameraOptionsCameraForCoordinates;
    }

    public final Cancelable subscribe(SourceAddedCallback sourceAddedCallback) {
        sourceAddedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(sourceAddedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final CameraOptions cameraForCoordinates(List<Point> points, EdgeInsets padding, Double bearing, Double pitch) {
        points.getClass();
        CameraOptions cameraOptionsCameraForCoordinates = this.map.cameraForCoordinates(points, padding, bearing, pitch);
        cameraOptionsCameraForCoordinates.getClass();
        return cameraOptionsCameraForCoordinates;
    }

    public final Cancelable subscribe(SourceRemovedCallback sourceRemovedCallback) {
        sourceRemovedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(sourceRemovedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(StyleImageMissingCallback styleImageMissingCallback) {
        styleImageMissingCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleImageMissingCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable removeFeatureState(FeaturesetDescriptor featureset, FeaturesetFeatureId featureId, String stateKey, FeatureStateOperationCallback callback) {
        featureset.getClass();
        featureId.getClass();
        callback.getClass();
        Cancelable cancelableRemoveFeatureState = this.map.removeFeatureState(featureset, featureId, stateKey, callback);
        cancelableRemoveFeatureState.getClass();
        return cancelableRemoveFeatureState;
    }

    public final Cancelable subscribe(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback) {
        styleImageRemoveUnusedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(styleImageRemoveUnusedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(CameraChangedCallback cameraChangedCallback) {
        cameraChangedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(cameraChangedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    @com.mapbox.annotation.MapboxExperimental
    public final Cancelable subscribe(CameraChangedCoalescedCallback cameraChangedCoalescedCallback) {
        cameraChangedCoalescedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(cameraChangedCoalescedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable setFeatureState(FeaturesetDescriptor featureset, FeaturesetFeatureId featureId, Value state, FeatureStateOperationCallback callback) {
        featureset.getClass();
        featureId.getClass();
        state.getClass();
        callback.getClass();
        Cancelable featureState = this.map.setFeatureState(featureset, featureId, state, callback);
        featureState.getClass();
        return featureState;
    }

    public final Cancelable subscribe(RenderFrameStartedCallback renderFrameStartedCallback) {
        renderFrameStartedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(renderFrameStartedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(RenderFrameFinishedCallback renderFrameFinishedCallback) {
        renderFrameFinishedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(renderFrameFinishedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(ResourceRequestCallback resourceRequestCallback) {
        resourceRequestCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(resourceRequestCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final Cancelable subscribe(MapLoadedCallback mapLoadedCallback) {
        mapLoadedCallback.getClass();
        Cancelable cancelableSubscribe = this.map.subscribe(mapLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }
}
