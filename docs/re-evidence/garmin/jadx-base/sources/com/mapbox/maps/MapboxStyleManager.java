package com.mapbox.maps;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Feature;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.HashMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0016H\u0017J$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0007J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007J$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0007J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\u0006\u0010/\u001a\u000200H\u0007J.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0017J&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;2\b\u00107\u001a\u0004\u0018\u000108H\u0017J$\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010=\u001a\u00020>H\u0017J.\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0017J$\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010=\u001a\u00020AH\u0017JZ\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00052\u0006\u00101\u001a\u0002022\u0006\u0010/\u001a\u0002002\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00162\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00162\b\u0010G\u001a\u0004\u0018\u00010HH\u0017JV\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0017JV\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0017J&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010T\u001a\u00020;2\b\u0010U\u001a\u0004\u0018\u000108H\u0017J$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010W\u001a\u00020\u00122\u0006\u0010X\u001a\u00020\u0012H\u0017J$\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0016H\u0017J\u0010\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\b\u0010_\u001a\u00020\u0012H\u0017J\u0012\u0010`\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020\u0012H\u0017J8\u0010a\u001a*\u0012\u0004\u0012\u00020\u0012\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]0Mj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]`N0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J$\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0017J\u001c\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017J\u001c\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u00104\u001a\u00020\u0012H\u0017J\u0018\u0010f\u001a\u00020]2\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0018\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00170jH\u0017J\u0010\u0010k\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0010\u0010l\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0007J\u0010\u0010m\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0007J\u001c\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J\u0018\u0010o\u001a\u00020]2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0010\u0010p\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\b\u0010q\u001a\u00020rH\u0017J\u0010\u0010s\u001a\u0002002\u0006\u0010,\u001a\u00020\u0012H\u0017J\u0010\u0010t\u001a\u0002002\u0006\u0010W\u001a\u00020\u0012H\u0017J$\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010v\u001a\u00020wH\u0017J$\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010y\u001a\u00020zH\u0017J\u001c\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002000%2\u0006\u00104\u001a\u00020\u0012H\u0017J\b\u0010|\u001a\u000200H\u0017J&\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010PH\u0017J&\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u000108H\u0017J3\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0017J\u001d\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u0012H\u0017J\u001d\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J\u001d\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u0012H\u0017J\u001d\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010W\u001a\u00020\u0012H\u0017J\u001d\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J\u001d\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J%\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0017J)\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0017J%\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0017J&\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0017J\n\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0017J\u001d\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010-\u001a\u00020.H\u0017J!\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0017J\u001d\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00101\u001a\u000202H\u0017J\u001e\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0017J4\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010y\u001a\u00020z2\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020*0jH\u0017J-\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u0016H\u0017J/\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0017J\u0013\u0010\u0099\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0012H\u0017JB\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122#\u0010\u009c\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0Mj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;`NH\u0017J.\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J%\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J.\u0010\u009f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J.\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001e\u0010¡\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0007\u0010¢\u0001\u001a\u00020;H\u0017J\u001d\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010¤\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0007J&\u0010¦\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0007J\u001d\u0010§\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010¨\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J%\u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J.\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u0013\u0010\u00ad\u0001\u001a\u00030\u008c\u00012\u0007\u0010®\u0001\u001a\u00020rH\u0017J\u0011\u0010¯\u0001\u001a\u0002002\u0006\u00104\u001a\u00020\u0012H\u0017J\u0011\u0010°\u0001\u001a\u0002002\u0006\u0010'\u001a\u00020\u0012H\u0017J3\u0010±\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0016H\u0017J%\u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0017JM\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`NH\u0017JM\u0010´\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`NH\u0017R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014¨\u0006µ\u0001"}, d2 = {"Lcom/mapbox/maps/MapboxStyleManager;", "", "styleManager", "Lcom/mapbox/maps/StyleManager;", "pixelRatio", "", "mapLoadingErrorDelegate", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "getMapLoadingErrorDelegate", "()Lcom/mapbox/maps/MapLoadingErrorDelegate;", "getPixelRatio", "()F", "styleDefaultCamera", "Lcom/mapbox/maps/CameraOptions;", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "styleJSON", "", "getStyleJSON", "()Ljava/lang/String;", "styleLayers", "", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleLayers", "()Ljava/util/List;", "getStyleManager", "()Lcom/mapbox/maps/StyleManager;", "styleSlots", "getStyleSlots$annotations", "()V", "getStyleSlots", "styleSources", "getStyleSources", "styleURI", "getStyleURI", "addGeoJSONSourceFeatures", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "sourceId", "dataId", "features", "Lcom/mapbox/geojson/Feature;", "addImage", "imageId", "bitmap", "Landroid/graphics/Bitmap;", "sdf", "", "image", "Lcom/mapbox/maps/Image;", "addPersistentStyleCustomLayer", "layerId", "layerHost", "Lcom/mapbox/maps/CustomLayerHost;", "layerPosition", "Lcom/mapbox/maps/LayerPosition;", "addPersistentStyleLayer", "properties", "Lcom/mapbox/bindgen/Value;", "addStyleCustomGeometrySource", "options", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "addStyleCustomLayer", "addStyleCustomRasterSource", "Lcom/mapbox/maps/CustomRasterSourceOptions;", "addStyleImage", "scale", "stretchX", "Lcom/mapbox/maps/ImageStretches;", "stretchY", FirebaseAnalytics.Param.CONTENT, "Lcom/mapbox/maps/ImageContent;", "addStyleImportFromJSON", "importId", "json", "config", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "importPosition", "Lcom/mapbox/maps/ImportPosition;", "addStyleImportFromURI", "uri", "addStyleLayer", "parameters", ModelSourceWrapper.POSITION, "addStyleModel", "modelId", "modelUri", "addStyleSource", "getFeaturesets", "Lcom/mapbox/maps/FeaturesetDescriptor;", "getStyleAtmosphereProperty", "Lcom/mapbox/maps/StylePropertyValue;", "property", "getStyleGlyphURL", "getStyleImage", "getStyleImportConfigProperties", "getStyleImportConfigProperty", "getStyleImportSchema", "getStyleImports", "getStyleLayerProperties", "getStyleLayerProperty", "getStyleLightProperty", TtmlNode.ATTR_ID, "getStyleLights", "", "getStyleProjectionProperty", "getStyleRainProperty", "getStyleSnowProperty", "getStyleSourceProperties", "getStyleSourceProperty", "getStyleTerrainProperty", "getStyleTransition", "Lcom/mapbox/maps/TransitionOptions;", "hasStyleImage", "hasStyleModel", "invalidateStyleCustomGeometrySourceRegion", "coordinateBounds", "Lcom/mapbox/maps/CoordinateBounds;", "invalidateStyleCustomGeometrySourceTile", "tileId", "Lcom/mapbox/maps/CanonicalTileID;", "isStyleLayerPersistent", "isStyleLoaded", "moveStyleImport", "moveStyleLayer", "removeGeoJSONSourceFeatures", "featureIds", "removeStyleImage", "removeStyleImport", "removeStyleLayer", "removeStyleModel", "removeStyleSource", "removeStyleSourceUnchecked", "setImportColorTheme", "colorTheme", "Lcom/mapbox/maps/ColorTheme;", "base64", "setInitialStyleColorTheme", "", "setStyleAtmosphere", "setStyleAtmosphereProperty", "value", "setStyleColorTheme", "setStyleCustomGeometrySourceTileData", "featureCollection", "setStyleCustomRasterSourceTileData", "tiles", "Lcom/mapbox/maps/CustomRasterSourceTileData;", "setStyleGeoJSONSourceData", "data", "Lcom/mapbox/maps/GeoJSONSourceData;", "setStyleGlyphURL", "url", "setStyleImportConfigProperties", "configs", "setStyleImportConfigProperty", "setStyleLayerProperties", "setStyleLayerProperty", "setStyleLightProperty", "setStyleLights", "lights", "setStyleProjection", "setStyleProjectionProperty", "setStyleRain", "setStyleRainProperty", "setStyleSnow", "setStyleSnowProperty", "setStyleSourceProperties", "setStyleSourceProperty", "setStyleTerrain", "setStyleTerrainProperty", "setStyleTransition", "transitionOptions", "styleLayerExists", "styleSourceExists", "updateGeoJSONSourceFeatures", "updateStyleImageSourceImage", "updateStyleImportWithJSON", "updateStyleImportWithURI", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class MapboxStyleManager {
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final float pixelRatio;
    private final StyleManager styleManager;

    public MapboxStyleManager(StyleManager styleManager, float f14, MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        styleManager.getClass();
        mapLoadingErrorDelegate.getClass();
        this.styleManager = styleManager;
        this.pixelRatio = f14;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    public Expected<String, None> addGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        sourceId.getClass();
        dataId.getClass();
        features.getClass();
        Expected<String, None> expectedAddGeoJSONSourceFeatures = this.styleManager.addGeoJSONSourceFeatures(sourceId, dataId, features);
        expectedAddGeoJSONSourceFeatures.getClass();
        return expectedAddGeoJSONSourceFeatures;
    }

    public final Expected<String, None> addImage(String imageId, Image image, boolean sdf) {
        imageId.getClass();
        image.getClass();
        float f14 = this.pixelRatio;
        j0 j0Var = j0.f134944a;
        return addStyleImage(imageId, f14, image, sdf, j0Var, j0Var, null);
    }

    public Expected<String, None> addPersistentStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        layerId.getClass();
        layerHost.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddPersistentStyleCustomLayer = this.styleManager.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
        expectedAddPersistentStyleCustomLayer.getClass();
        return expectedAddPersistentStyleCustomLayer;
    }

    public Expected<String, None> addPersistentStyleLayer(Value properties, LayerPosition layerPosition) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddPersistentStyleLayer = this.styleManager.addPersistentStyleLayer(properties, layerPosition);
        expectedAddPersistentStyleLayer.getClass();
        return expectedAddPersistentStyleLayer;
    }

    public Expected<String, None> addStyleCustomGeometrySource(String sourceId, CustomGeometrySourceOptions options) {
        sourceId.getClass();
        options.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomGeometrySource = this.styleManager.addStyleCustomGeometrySource(sourceId, options);
        expectedAddStyleCustomGeometrySource.getClass();
        return expectedAddStyleCustomGeometrySource;
    }

    public Expected<String, None> addStyleCustomLayer(String layerId, CustomLayerHost layerHost, LayerPosition layerPosition) {
        layerId.getClass();
        layerHost.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomLayer = this.styleManager.addStyleCustomLayer(layerId, layerHost, layerPosition);
        expectedAddStyleCustomLayer.getClass();
        return expectedAddStyleCustomLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(String sourceId, CustomRasterSourceOptions options) {
        sourceId.getClass();
        options.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleCustomRasterSource = this.styleManager.addStyleCustomRasterSource(sourceId, options);
        expectedAddStyleCustomRasterSource.getClass();
        return expectedAddStyleCustomRasterSource;
    }

    public Expected<String, None> addStyleImage(String imageId, float scale, Image image, boolean sdf, List<ImageStretches> stretchX, List<ImageStretches> stretchY, ImageContent content) {
        imageId.getClass();
        image.getClass();
        stretchX.getClass();
        stretchY.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImage = this.styleManager.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
        expectedAddStyleImage.getClass();
        return expectedAddStyleImage;
    }

    public Expected<String, None> addStyleImportFromJSON(String importId, String json, HashMap<String, Value> config, ImportPosition importPosition) {
        importId.getClass();
        json.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImportFromJSON = this.styleManager.addStyleImportFromJSON(importId, json, config, importPosition);
        expectedAddStyleImportFromJSON.getClass();
        return expectedAddStyleImportFromJSON;
    }

    public Expected<String, None> addStyleImportFromURI(String importId, String uri, HashMap<String, Value> config, ImportPosition importPosition) {
        importId.getClass();
        uri.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleImportFromURI = this.styleManager.addStyleImportFromURI(importId, uri, config, importPosition);
        expectedAddStyleImportFromURI.getClass();
        return expectedAddStyleImportFromURI;
    }

    public Expected<String, None> addStyleLayer(Value parameters, LayerPosition position) {
        parameters.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleLayer = this.styleManager.addStyleLayer(parameters, position);
        expectedAddStyleLayer.getClass();
        return expectedAddStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> addStyleModel(String modelId, String modelUri) {
        modelId.getClass();
        modelUri.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleModel = this.styleManager.addStyleModel(modelId, modelUri);
        expectedAddStyleModel.getClass();
        return expectedAddStyleModel;
    }

    public Expected<String, None> addStyleSource(String sourceId, Value properties) {
        sourceId.getClass();
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedAddStyleSource = this.styleManager.addStyleSource(sourceId, properties);
        expectedAddStyleSource.getClass();
        return expectedAddStyleSource;
    }

    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<FeaturesetDescriptor> styleFeaturesets = this.styleManager.getStyleFeaturesets();
        styleFeaturesets.getClass();
        return styleFeaturesets;
    }

    public final MapLoadingErrorDelegate getMapLoadingErrorDelegate() {
        return this.mapLoadingErrorDelegate;
    }

    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    public StylePropertyValue getStyleAtmosphereProperty(String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleAtmosphereProperty = this.styleManager.getStyleAtmosphereProperty(property);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    public CameraOptions getStyleDefaultCamera() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        CameraOptions styleDefaultCamera = this.styleManager.getStyleDefaultCamera();
        styleDefaultCamera.getClass();
        return styleDefaultCamera;
    }

    @MapboxExperimental
    public String getStyleGlyphURL() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleGlyphURL = this.styleManager.getStyleGlyphURL();
        styleGlyphURL.getClass();
        return styleGlyphURL;
    }

    public Image getStyleImage(String imageId) {
        imageId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.getStyleImage(imageId);
    }

    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(String importId) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, HashMap<String, StylePropertyValue>> styleImportConfigProperties = this.styleManager.getStyleImportConfigProperties(importId);
        styleImportConfigProperties.getClass();
        return styleImportConfigProperties;
    }

    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(String importId, String config) {
        importId.getClass();
        config.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, StylePropertyValue> styleImportConfigProperty = this.styleManager.getStyleImportConfigProperty(importId, config);
        styleImportConfigProperty.getClass();
        return styleImportConfigProperty;
    }

    public Expected<String, Value> getStyleImportSchema(String importId) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleImportSchema = this.styleManager.getStyleImportSchema(importId);
        styleImportSchema.getClass();
        return styleImportSchema;
    }

    public List<StyleObjectInfo> getStyleImports() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleImports = this.styleManager.getStyleImports();
        styleImports.getClass();
        return styleImports;
    }

    public String getStyleJSON() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleJSON = this.styleManager.getStyleJSON();
        styleJSON.getClass();
        return styleJSON;
    }

    public Expected<String, Value> getStyleLayerProperties(String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleLayerProperties = this.styleManager.getStyleLayerProperties(layerId);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    public StylePropertyValue getStyleLayerProperty(String layerId, String property) {
        layerId.getClass();
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLayerProperty = this.styleManager.getStyleLayerProperty(layerId, property);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    public List<StyleObjectInfo> getStyleLayers() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLayers = this.styleManager.getStyleLayers();
        styleLayers.getClass();
        return styleLayers;
    }

    public StylePropertyValue getStyleLightProperty(String id3, String property) {
        id3.getClass();
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLightProperty = this.styleManager.getStyleLightProperty(id3, property);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public List<StyleObjectInfo> getStyleLights() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLights = this.styleManager.getStyleLights();
        styleLights.getClass();
        return styleLights;
    }

    public final StyleManager getStyleManager() {
        return this.styleManager;
    }

    public StylePropertyValue getStyleProjectionProperty(String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleProjectionProperty = this.styleManager.getStyleProjectionProperty(property);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleRainProperty(String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleRainProperty = this.styleManager.getStyleRainProperty(property);
        styleRainProperty.getClass();
        return styleRainProperty;
    }

    public List<String> getStyleSlots() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<String> styleSlots = this.styleManager.getStyleSlots();
        styleSlots.getClass();
        return styleSlots;
    }

    @MapboxExperimental
    public final StylePropertyValue getStyleSnowProperty(String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSnowProperty = this.styleManager.getStyleSnowProperty(property);
        styleSnowProperty.getClass();
        return styleSnowProperty;
    }

    public Expected<String, Value> getStyleSourceProperties(String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleSourceProperties = this.styleManager.getStyleSourceProperties(sourceId);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    public StylePropertyValue getStyleSourceProperty(String sourceId, String property) {
        sourceId.getClass();
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSourceProperty = this.styleManager.getStyleSourceProperty(sourceId, property);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public List<StyleObjectInfo> getStyleSources() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleSources = this.styleManager.getStyleSources();
        styleSources.getClass();
        return styleSources;
    }

    public StylePropertyValue getStyleTerrainProperty(String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleTerrainProperty = this.styleManager.getStyleTerrainProperty(property);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public TransitionOptions getStyleTransition() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        TransitionOptions styleTransition = this.styleManager.getStyleTransition();
        styleTransition.getClass();
        return styleTransition;
    }

    public String getStyleURI() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleURI = this.styleManager.getStyleURI();
        styleURI.getClass();
        return styleURI;
    }

    public boolean hasStyleImage(String imageId) {
        imageId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleImage(imageId);
    }

    @MapboxExperimental
    public boolean hasStyleModel(String modelId) {
        modelId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleModel(modelId);
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(String sourceId, CoordinateBounds coordinateBounds) {
        sourceId.getClass();
        coordinateBounds.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceRegion = this.styleManager.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
        expectedInvalidateStyleCustomGeometrySourceRegion.getClass();
        return expectedInvalidateStyleCustomGeometrySourceRegion;
    }

    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(String sourceId, CanonicalTileID tileId) {
        sourceId.getClass();
        tileId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedInvalidateStyleCustomGeometrySourceTile = this.styleManager.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
        expectedInvalidateStyleCustomGeometrySourceTile.getClass();
        return expectedInvalidateStyleCustomGeometrySourceTile;
    }

    public Expected<String, Boolean> isStyleLayerPersistent(String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Boolean> expectedIsStyleLayerPersistent = this.styleManager.isStyleLayerPersistent(layerId);
        expectedIsStyleLayerPersistent.getClass();
        return expectedIsStyleLayerPersistent;
    }

    public boolean isStyleLoaded() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.isStyleLoaded();
    }

    public Expected<String, None> moveStyleImport(String importId, ImportPosition importPosition) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedMoveStyleImport = this.styleManager.moveStyleImport(importId, importPosition);
        expectedMoveStyleImport.getClass();
        return expectedMoveStyleImport;
    }

    public Expected<String, None> moveStyleLayer(String layerId, LayerPosition layerPosition) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedMoveStyleLayer = this.styleManager.moveStyleLayer(layerId, layerPosition);
        expectedMoveStyleLayer.getClass();
        return expectedMoveStyleLayer;
    }

    public Expected<String, None> removeGeoJSONSourceFeatures(String sourceId, String dataId, List<String> featureIds) {
        sourceId.getClass();
        dataId.getClass();
        featureIds.getClass();
        Expected<String, None> expectedRemoveGeoJSONSourceFeatures = this.styleManager.removeGeoJSONSourceFeatures(sourceId, dataId, featureIds);
        expectedRemoveGeoJSONSourceFeatures.getClass();
        return expectedRemoveGeoJSONSourceFeatures;
    }

    public Expected<String, None> removeStyleImage(String imageId) {
        imageId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleImage = this.styleManager.removeStyleImage(imageId);
        expectedRemoveStyleImage.getClass();
        return expectedRemoveStyleImage;
    }

    public Expected<String, None> removeStyleImport(String importId) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleImport = this.styleManager.removeStyleImport(importId);
        expectedRemoveStyleImport.getClass();
        return expectedRemoveStyleImport;
    }

    public Expected<String, None> removeStyleLayer(String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleLayer = this.styleManager.removeStyleLayer(layerId);
        expectedRemoveStyleLayer.getClass();
        return expectedRemoveStyleLayer;
    }

    @MapboxExperimental
    public Expected<String, None> removeStyleModel(String modelId) {
        modelId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleModel = this.styleManager.removeStyleModel(modelId);
        expectedRemoveStyleModel.getClass();
        return expectedRemoveStyleModel;
    }

    public Expected<String, None> removeStyleSource(String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleSource = this.styleManager.removeStyleSource(sourceId);
        expectedRemoveStyleSource.getClass();
        return expectedRemoveStyleSource;
    }

    public Expected<String, None> removeStyleSourceUnchecked(String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedRemoveStyleSourceUnchecked = this.styleManager.removeStyleSourceUnchecked(sourceId);
        expectedRemoveStyleSourceUnchecked.getClass();
        return expectedRemoveStyleSourceUnchecked;
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, String base64) {
        importId.getClass();
        base64.getClass();
        return setImportColorTheme(importId, ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    @MapboxExperimental
    public void setInitialStyleColorTheme() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setInitialStyleColorTheme();
    }

    public Expected<String, None> setStyleAtmosphere(Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphere = this.styleManager.setStyleAtmosphere(properties);
        styleAtmosphere.getClass();
        return styleAtmosphere;
    }

    public Expected<String, None> setStyleAtmosphereProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphereProperty = this.styleManager.setStyleAtmosphereProperty(property, value);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(String base64) {
        base64.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    public Expected<String, None> setStyleCustomGeometrySourceTileData(String sourceId, CanonicalTileID tileId, List<Feature> featureCollection) {
        sourceId.getClass();
        tileId.getClass();
        featureCollection.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomGeometrySourceTileData = this.styleManager.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
        styleCustomGeometrySourceTileData.getClass();
        return styleCustomGeometrySourceTileData;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(String sourceId, List<CustomRasterSourceTileData> tiles) {
        sourceId.getClass();
        tiles.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomRasterSourceTileData = this.styleManager.setStyleCustomRasterSourceTileData(sourceId, tiles);
        styleCustomRasterSourceTileData.getClass();
        return styleCustomRasterSourceTileData;
    }

    public Expected<String, None> setStyleGeoJSONSourceData(String sourceId, String dataId, GeoJSONSourceData data) {
        sourceId.getClass();
        dataId.getClass();
        data.getClass();
        Expected<String, None> styleGeoJSONSourceData = this.styleManager.setStyleGeoJSONSourceData(sourceId, dataId, data);
        styleGeoJSONSourceData.getClass();
        return styleGeoJSONSourceData;
    }

    @MapboxExperimental
    public void setStyleGlyphURL(String url) {
        url.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleGlyphURL(url);
    }

    public Expected<String, None> setStyleImportConfigProperties(String importId, HashMap<String, Value> configs) {
        importId.getClass();
        configs.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperties = this.styleManager.setStyleImportConfigProperties(importId, configs);
        styleImportConfigProperties.getClass();
        return styleImportConfigProperties;
    }

    public Expected<String, None> setStyleImportConfigProperty(String importId, String config, Value value) {
        importId.getClass();
        config.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperty = this.styleManager.setStyleImportConfigProperty(importId, config, value);
        styleImportConfigProperty.getClass();
        return styleImportConfigProperty;
    }

    public Expected<String, None> setStyleLayerProperties(String layerId, Value properties) {
        layerId.getClass();
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperties = this.styleManager.setStyleLayerProperties(layerId, properties);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    public Expected<String, None> setStyleLayerProperty(String layerId, String property, Value value) {
        layerId.getClass();
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperty = this.styleManager.setStyleLayerProperty(layerId, property, value);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    public Expected<String, None> setStyleLightProperty(String id3, String property, Value value) {
        id3.getClass();
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLightProperty = this.styleManager.setStyleLightProperty(id3, property, value);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    public Expected<String, None> setStyleLights(Value lights) {
        lights.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLights = this.styleManager.setStyleLights(lights);
        styleLights.getClass();
        return styleLights;
    }

    public Expected<String, None> setStyleProjection(Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjection = this.styleManager.setStyleProjection(properties);
        styleProjection.getClass();
        return styleProjection;
    }

    public Expected<String, None> setStyleProjectionProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjectionProperty = this.styleManager.setStyleProjectionProperty(property, value);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRain(Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRain = this.styleManager.setStyleRain(properties);
        styleRain.getClass();
        return styleRain;
    }

    @MapboxExperimental
    public final Expected<String, None> setStyleRainProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRainProperty = this.styleManager.setStyleRainProperty(property, value);
        styleRainProperty.getClass();
        return styleRainProperty;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnow(Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnow = this.styleManager.setStyleSnow(properties);
        styleSnow.getClass();
        return styleSnow;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleSnowProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnowProperty = this.styleManager.setStyleSnowProperty(property, value);
        styleSnowProperty.getClass();
        return styleSnowProperty;
    }

    public Expected<String, None> setStyleSourceProperties(String sourceId, Value properties) {
        sourceId.getClass();
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperties = this.styleManager.setStyleSourceProperties(sourceId, properties);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    public Expected<String, None> setStyleSourceProperty(String sourceId, String property, Value value) {
        sourceId.getClass();
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperty = this.styleManager.setStyleSourceProperty(sourceId, property, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    public Expected<String, None> setStyleTerrain(Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrain = this.styleManager.setStyleTerrain(properties);
        styleTerrain.getClass();
        return styleTerrain;
    }

    public Expected<String, None> setStyleTerrainProperty(String property, Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrainProperty = this.styleManager.setStyleTerrainProperty(property, value);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    public void setStyleTransition(TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleTransition(transitionOptions);
    }

    public boolean styleLayerExists(String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleLayerExists(layerId);
    }

    public boolean styleSourceExists(String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleSourceExists(sourceId);
    }

    public Expected<String, None> updateGeoJSONSourceFeatures(String sourceId, String dataId, List<Feature> features) {
        sourceId.getClass();
        dataId.getClass();
        features.getClass();
        Expected<String, None> expectedUpdateGeoJSONSourceFeatures = this.styleManager.updateGeoJSONSourceFeatures(sourceId, dataId, features);
        expectedUpdateGeoJSONSourceFeatures.getClass();
        return expectedUpdateGeoJSONSourceFeatures;
    }

    public Expected<String, None> updateStyleImageSourceImage(String sourceId, Image image) {
        sourceId.getClass();
        image.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImageSourceImage = this.styleManager.updateStyleImageSourceImage(sourceId, image);
        expectedUpdateStyleImageSourceImage.getClass();
        return expectedUpdateStyleImageSourceImage;
    }

    public Expected<String, None> updateStyleImportWithJSON(String importId, String json, HashMap<String, Value> config) {
        importId.getClass();
        json.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImportWithJSON = this.styleManager.updateStyleImportWithJSON(importId, json, config);
        expectedUpdateStyleImportWithJSON.getClass();
        return expectedUpdateStyleImportWithJSON;
    }

    public Expected<String, None> updateStyleImportWithURI(String importId, String uri, HashMap<String, Value> config) {
        importId.getClass();
        uri.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> expectedUpdateStyleImportWithURI = this.styleManager.updateStyleImportWithURI(importId, uri, config);
        expectedUpdateStyleImportWithURI.getClass();
        return expectedUpdateStyleImportWithURI;
    }

    public final Expected<String, None> addImage(String imageId, Image image) {
        imageId.getClass();
        image.getClass();
        return addImage(imageId, image, false);
    }

    public final Expected<String, None> addImage(String imageId, Bitmap bitmap, boolean sdf) {
        imageId.getClass();
        bitmap.getClass();
        return addImage(imageId, ExtensionUtils.toMapboxImage(bitmap), sdf);
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(ColorTheme colorTheme) {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleColorTheme = this.styleManager.setStyleColorTheme(colorTheme);
        styleColorTheme.getClass();
        return styleColorTheme;
    }

    public final Expected<String, None> addImage(String imageId, Bitmap bitmap) {
        imageId.getClass();
        bitmap.getClass();
        return addImage(imageId, bitmap, false);
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Bitmap bitmap) {
        bitmap.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, ColorTheme colorTheme) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> importColorTheme = this.styleManager.setImportColorTheme(importId, colorTheme);
        importColorTheme.getClass();
        return importColorTheme;
    }

    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(Image image) {
        image.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(image));
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Bitmap bitmap) {
        importId.getClass();
        bitmap.getClass();
        return setImportColorTheme(importId, ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(String importId, Image image) {
        importId.getClass();
        image.getClass();
        return setImportColorTheme(importId, ColorTheme.valueOf(image));
    }
}
