package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.seuqneceutils.SequenceDetailFieldConfig;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: zfj, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0000\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\b\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a \u0010\u0010\u001a\u00020\u0005*\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010\u0011\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0001\u001a\r\u0010\u0014\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a \u0010\u0015\u001a\u00020\u0005*\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0001H\u0086\u0002\u001a\u000f\u0010\u0018\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0087\b\u001aD\u0010\u0019\u001a\u0002H\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0001*\u0002H\u001a\"\u0004\b\u0001\u0010\u001a*\u0002H\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u001e\u001aD\u0010\u001f\u001a\u0002H\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0001*\u0002H\u001a\"\u0004\b\u0001\u0010\u001a*\u0002H\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u001e\u001a\u0012\u0010'\u001a\u00020\u0005*\u00020\u00012\u0006\u0010(\u001a\u00020\r\u001a\u0012\u0010)\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!\u001a\u0012\u0010+\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u001d\u0010+\u001a\u00020\u0001*\u00020\u00062\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\rH\u0087\b\u001a\u001f\u0010)\u001a\u00020\u0006*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\b\b\u0002\u0010/\u001a\u00020\rH\u0087\b\u001a\u0012\u0010)\u001a\u00020\u0006*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u001c\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00105\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00105\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\"\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0001\u001a%\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0001H\u0087\b\u001a\u001a\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!2\u0006\u00107\u001a\u00020\u0001\u001a\u001d\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!2\u0006\u00107\u001a\u00020\u0001H\u0087\b\u001a\u001a\u00108\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r\u001a\u001d\u00108\u001a\u00020\u0006*\u00020\u00062\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0087\b\u001a\u0012\u00108\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u0015\u00108\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!H\u0087\b\u001a\u0012\u00109\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u0001\u001a\u0012\u00109\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u00020\u0001*\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u00020\u0006*\u00020\u00062\u0006\u0010<\u001a\u00020\u0001\u001a\u001a\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u001a\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u0012\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u00101\u001a\u00020\u0001\u001a\u0012\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u0001\u001a$\u0010>\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010>\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010A\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010A\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001d\u0010B\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u0006H\u0087\b\u001a.\u0010B\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0014\b\b\u0010E\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00010\u0003H\u0087\bø\u0001\u0000\u001a\u001d\u0010G\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u0006H\u0087\b\u001a)\u0010H\u001a\u00020\u0006*\u00020\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000¢\u0006\u0002\bI\u001a)\u0010H\u001a\u00020\u0006*\u00020\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0002\bJ\u001a\u0015\u0010K\u001a\u00020\u0005*\u00020\u00012\u0006\u0010C\u001a\u00020DH\u0087\f\u001a4\u0010L\u001a\u00020\u0005*\u00020\u00012\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u0005H\u0000\u001a\u001c\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010S\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a$\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010S\u001a\u00020\u0005*\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010T\u001a\u00020\u0006*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010U\u001a\u00020\u0006*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010V\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010W\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a;\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u00052\b\b\u0002\u0010Y\u001a\u00020\u0005H\u0002¢\u0006\u0002\bZ\u001aE\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\u0006\u0010.\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u0005H\u0002¢\u0006\u0002\b_\u001a:\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a:\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a,\u0010V\u001a\u00020\r*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a,\u0010W\u001a\u00020\r*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010a\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010b\u001a\u00020\r*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010b\u001a\u00020\r*\u00020\u00012\u0006\u0010a\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001f\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005H\u0086\u0002\u001a\u001f\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005H\u0086\u0002\u001a\u0015\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010C\u001a\u00020DH\u0087\n\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020!0e*\u00020\u00012\u0006\u0010f\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\rH\u0002¢\u0006\u0002\bh\u001aG\u0010d\u001a\b\u0012\u0004\u0012\u00020!0e*\u00020\u00012\u000e\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\rH\u0002¢\u0006\u0004\bh\u0010j\u001a\u0010\u0010k\u001a\u00020l2\u0006\u0010g\u001a\u00020\rH\u0000\u001a=\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\u0012\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i\"\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r¢\u0006\u0002\u0010n\u001a=\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0012\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i\"\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r¢\u0006\u0002\u0010q\u001a0\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\n\u0010f\u001a\u00020\n\"\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r\u001a0\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\n\u0010f\u001a\u00020\n\"\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r\u001a/\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0006\u00101\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\rH\u0002¢\u0006\u0002\br\u001a%\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010g\u001a\u00020\rH\u0087\b\u001a%\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010g\u001a\u00020\rH\u0087\b\u001a\u0010\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u0001\u001a\u0010\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u0001\u001a\u0018\u0010u\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0018\u0010v\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010w\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010x\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010y\"\u0015\u0010 \u001a\u00020!*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010$\u001a\u00020\r*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006z"}, d2 = {"trim", "", "predicate", "Lkotlin/Function1;", "", "", "", "trimStart", "trimEnd", "chars", "", "padStart", "length", "", "padChar", "padEnd", "isNullOrEmpty", "isEmpty", "isNotEmpty", "isBlank", "isNotBlank", "isNullOrBlank", "iterator", "Lkotlin/collections/CharIterator;", "orEmpty", "ifEmpty", "R", TypeParams.SEARCH_CODE, "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifBlank", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "(Ljava/lang/CharSequence;)I", "hasSurrogatePairAt", "index", "substring", "range", "subSequence", "start", TtmlNode.END, "startIndex", "endIndex", "substringBefore", TtmlNode.RUBY_DELIMITER, "missingDelimiterValue", "substringAfter", "substringBeforeLast", "substringAfterLast", "replaceRange", "replacement", "removeRange", "removePrefix", "prefix", "removeSuffix", "suffix", "removeSurrounding", "replaceBefore", "replaceAfter", "replaceAfterLast", "replaceBeforeLast", "replace", "regex", "Lkotlin/text/Regex;", "transform", "Lkotlin/text/MatchResult;", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "matches", "regionMatchesImpl", "thisOffset", "other", "otherOffset", "ignoreCase", "startsWith", SequenceDetailFieldConfig.CHAR, "endsWith", "commonPrefixWith", "commonSuffixWith", "indexOfAny", "lastIndexOfAny", "indexOf", "last", "indexOf$StringsKt__StringsKt", "findAnyOf", "Lkotlin/Pair;", "strings", "", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "string", "lastIndexOf", "contains", "rangesDelimitedBy", "Lkotlin/sequences/Sequence;", "delimiters", BleConstants.LIMIT, "rangesDelimitedBy$StringsKt__StringsKt", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "requireNonNegativeLimit", "", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "split", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "lineSequence", "lines", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class trim extends nativeIndexOf {

    /* JADX INFO: renamed from: zfj$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Sequence<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f54053b;

        public c(CharSequence charSequence) {
            this.f54053b = charSequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<String> iterator() {
            return new zeo(this.f54053b);
        }
    }

    public static final CharSequence a(CharSequence charSequence, int i, char c2) {
        zcp.c(charSequence, "");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c2);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static final String e(String str, int i, char c2) {
        zcp.c(str, "");
        return zes.a(str, i, c2).toString();
    }

    public static final int e(CharSequence charSequence) {
        zcp.c(charSequence, "");
        return charSequence.length() - 1;
    }

    public static final String c(CharSequence charSequence, zdl zdlVar) {
        zcp.c(charSequence, "");
        zcp.c(zdlVar, "");
        return charSequence.subSequence(zdlVar.getStart().intValue(), zdlVar.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ String a(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return zes.a(str, c2, str2);
    }

    public static final String a(String str, char c2, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        int iA = zes.a((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (iA == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iA);
        zcp.b((Object) strSubstring, "");
        return strSubstring;
    }

    public static /* synthetic */ String e(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return zes.c(str, str2, str3);
    }

    public static final String c(String str, String str2, String str3) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        int iA = zes.a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (iA == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iA);
        zcp.b((Object) strSubstring, "");
        return strSubstring;
    }

    public static /* synthetic */ String c(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return zes.b(str, c2, str2);
    }

    public static final String b(String str, char c2, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        int iA = zes.a((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (iA == -1) {
            return str2;
        }
        String strSubstring = str.substring(iA + 1, str.length());
        zcp.b((Object) strSubstring, "");
        return strSubstring;
    }

    public static /* synthetic */ String c(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return zes.b(str, str2, str3);
    }

    public static final String b(String str, String str2, String str3) {
        zcp.c(str, "");
        zcp.c(str2, "");
        zcp.c(str3, "");
        int iA = zes.a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (iA == -1) {
            return str3;
        }
        String strSubstring = str.substring(iA + str2.length(), str.length());
        zcp.b((Object) strSubstring, "");
        return strSubstring;
    }

    public static final String d(String str, CharSequence charSequence) {
        zcp.c(str, "");
        zcp.c(charSequence, "");
        if (!zes.c((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        zcp.b((Object) strSubstring, "");
        return strSubstring;
    }

    public static final String a(String str, CharSequence charSequence) {
        zcp.c(str, "");
        zcp.c(charSequence, "");
        if (!zes.a((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        zcp.b((Object) strSubstring, "");
        return strSubstring;
    }

    public static final String c(String str, CharSequence charSequence, CharSequence charSequence2) {
        zcp.c(str, "");
        zcp.c(charSequence, "");
        zcp.c(charSequence2, "");
        if (str.length() < charSequence.length() + charSequence2.length()) {
            return str;
        }
        String str2 = str;
        if (!zes.c((CharSequence) str2, charSequence, false, 2, (Object) null) || !zes.a((CharSequence) str2, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        zcp.b((Object) strSubstring, "");
        return strSubstring;
    }

    public static final String e(String str, CharSequence charSequence) {
        zcp.c(str, "");
        zcp.c(charSequence, "");
        return zes.c(str, charSequence, charSequence);
    }

    public static final boolean b(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(charSequence2, "");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!zek.e(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return zes.c(charSequence, charSequence2, z);
    }

    public static final boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(charSequence2, "");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return zes.e((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return zes.b(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return zes.d(charSequence, charSequence2, z);
    }

    public static final boolean d(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(charSequence2, "");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return zes.c((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return zes.b(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static final int e(CharSequence charSequence, char[] cArr, int i, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(yzk.b(cArr), i);
        }
        int iC = zdm.c(i, 0);
        int iE = zes.e(charSequence);
        if (iC > iE) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iC);
            for (char c2 : cArr) {
                if (zek.e(c2, cCharAt, z)) {
                    return iC;
                }
            }
            if (iC == iE) {
                return -1;
            }
            iC++;
        }
    }

    public static final int b(CharSequence charSequence, char[] cArr, int i, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(cArr, "");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(yzk.b(cArr), i);
        }
        for (int iE = zdm.e(i, zes.e(charSequence)); -1 < iE; iE--) {
            char cCharAt = charSequence.charAt(iE);
            for (char c2 : cArr) {
                if (zek.e(c2, cCharAt, z)) {
                    return iE;
                }
            }
        }
        return -1;
    }

    static /* synthetic */ int c(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return b(charSequence, charSequence2, i, i2, z, z2);
    }

    private static final int b(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        zdl zdlVarD;
        if (!z2) {
            zdlVarD = new zdl(zdm.c(i, 0), zdm.e(i2, charSequence.length()));
        } else {
            zdlVarD = zdm.d(zdm.e(i, zes.e(charSequence)), zdm.c(i2, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int f53990c = zdlVarD.getF53990c();
            int d = zdlVarD.getD();
            int f53989a = zdlVarD.getF53989a();
            if ((f53989a <= 0 || f53990c > d) && (f53989a >= 0 || d > f53990c)) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence2;
                if (zes.b(str, 0, (String) charSequence, f53990c, str.length(), z)) {
                    return f53990c;
                }
                if (f53990c == d) {
                    return -1;
                }
                f53990c += f53989a;
            }
        } else {
            int f53990c2 = zdlVarD.getF53990c();
            int d2 = zdlVarD.getD();
            int f53989a2 = zdlVarD.getF53989a();
            if ((f53989a2 <= 0 || f53990c2 > d2) && (f53989a2 >= 0 || d2 > f53990c2)) {
                return -1;
            }
            while (!zes.b(charSequence2, 0, charSequence, f53990c2, charSequence2.length(), z)) {
                if (f53990c2 == d2) {
                    return -1;
                }
                f53990c2 += f53989a2;
            }
            return f53990c2;
        }
    }

    private static final yyu<Integer, String> a(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object next;
        String str;
        Object next2;
        String str2;
        if (!z && collection.size() == 1) {
            String str3 = (String) yzp.e((Iterable) collection);
            int iA = !z2 ? zes.a(charSequence, str3, i, false, 4, (Object) null) : zes.d(charSequence, str3, i, false, 4, (Object) null);
            if (iA < 0) {
                return null;
            }
            return yyz.c(Integer.valueOf(iA), str3);
        }
        zdl zdlVar = !z2 ? new zdl(zdm.c(i, 0), charSequence.length()) : zdm.d(zdm.e(i, zes.e(charSequence)), 0);
        if (charSequence instanceof String) {
            int f53990c = zdlVar.getF53990c();
            int d = zdlVar.getD();
            int f53989a = zdlVar.getF53989a();
            if ((f53989a > 0 && f53990c <= d) || (f53989a < 0 && d <= f53990c)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str2 = (String) next2;
                    } while (!zes.b(str2, 0, (String) charSequence, f53990c, str2.length(), z));
                    String str4 = (String) next2;
                    if (str4 != null) {
                        return yyz.c(Integer.valueOf(f53990c), str4);
                    }
                    if (f53990c != d) {
                        f53990c += f53989a;
                    }
                }
            }
        } else {
            int f53990c2 = zdlVar.getF53990c();
            int d2 = zdlVar.getD();
            int f53989a2 = zdlVar.getF53989a();
            if ((f53989a2 > 0 && f53990c2 <= d2) || (f53989a2 < 0 && d2 <= f53990c2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        str = (String) next;
                    } while (!zes.b(str, 0, charSequence, f53990c2, str.length(), z));
                    String str5 = (String) next;
                    if (str5 != null) {
                        return yyz.c(Integer.valueOf(f53990c2), str5);
                    }
                    if (f53990c2 != d2) {
                        f53990c2 += f53989a2;
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return zes.d(charSequence, c2, i, z);
    }

    public static final int d(CharSequence charSequence, char c2, int i, boolean z) {
        zcp.c(charSequence, "");
        return (z || !(charSequence instanceof String)) ? zes.e(charSequence, new char[]{c2}, i, z) : ((String) charSequence).indexOf(c2, i);
    }

    public static /* synthetic */ int a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return zes.c(charSequence, str, i, z);
    }

    public static final int c(CharSequence charSequence, String str, int i, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(str, "");
        if (z || !(charSequence instanceof String)) {
            return c(charSequence, str, i, charSequence.length(), z, false, 16, null);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ int d(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = zes.e(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return zes.a(charSequence, c2, i, z);
    }

    public static final int a(CharSequence charSequence, char c2, int i, boolean z) {
        zcp.c(charSequence, "");
        return (z || !(charSequence instanceof String)) ? zes.b(charSequence, new char[]{c2}, i, z) : ((String) charSequence).lastIndexOf(c2, i);
    }

    public static /* synthetic */ int d(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = zes.e(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return zes.e(charSequence, str, i, z);
    }

    public static final int e(CharSequence charSequence, String str, int i, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(str, "");
        if (z || !(charSequence instanceof String)) {
            return b(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return zes.a(charSequence, charSequence2, z);
    }

    public static final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        zcp.c(charSequence, "");
        zcp.c(charSequence2, "");
        if (charSequence2 instanceof String) {
            return zes.a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0;
        }
        return c(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean b(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return zes.a(charSequence, c2, z);
    }

    public static final boolean a(CharSequence charSequence, char c2, boolean z) {
        zcp.c(charSequence, "");
        return zes.a(charSequence, c2, 0, z, 2, (Object) null) >= 0;
    }

    static /* synthetic */ Sequence c(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return b(charSequence, cArr, i, z, i2);
    }

    private static final Sequence<zdl> b(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        zes.d(i2);
        return new zem(charSequence, i, i2, new Function2() { // from class: zfi
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return trim.e(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yyu e(char[] cArr, boolean z, CharSequence charSequence, int i) {
        zcp.c(charSequence, "");
        int iE = zes.e(charSequence, cArr, i, z);
        if (iE < 0) {
            return null;
        }
        return yyz.c(Integer.valueOf(iE), 1);
    }

    static /* synthetic */ Sequence c(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return b(charSequence, strArr, i, z, i2);
    }

    private static final Sequence<zdl> b(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        zes.d(i2);
        final List listA = yzk.a(strArr);
        return new zem(charSequence, i, i2, new Function2() { // from class: zfg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return trim.e(listA, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yyu e(List list, boolean z, CharSequence charSequence, int i) {
        zcp.c(charSequence, "");
        yyu<Integer, String> yyuVarA = a(charSequence, (Collection<String>) list, i, z, false);
        if (yyuVarA != null) {
            return yyz.c(yyuVarA.c(), Integer.valueOf(yyuVarA.d().length()));
        }
        return null;
    }

    public static final void d(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static /* synthetic */ List b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return zes.a(charSequence, strArr, z, i);
    }

    public static final List<String> a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        zcp.c(charSequence, "");
        zcp.c(strArr, "");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return a(charSequence, str, z, i);
            }
        }
        Iterable iterableE = zdz.e(c(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(yzp.e(iterableE, 10));
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            arrayList.add(zes.c(charSequence, (zdl) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List d(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return zes.c(charSequence, cArr, z, i);
    }

    public static final List<String> c(CharSequence charSequence, char[] cArr, boolean z, int i) {
        zcp.c(charSequence, "");
        zcp.c(cArr, "");
        if (cArr.length == 1) {
            return a(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable iterableE = zdz.e(c(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(yzp.e(iterableE, 10));
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            arrayList.add(zes.c(charSequence, (zdl) it.next()));
        }
        return arrayList;
    }

    private static final List<String> a(CharSequence charSequence, String str, boolean z, int i) {
        zes.d(i);
        int length = 0;
        int iC = zes.c(charSequence, str, 0, z);
        if (iC == -1 || i == 1) {
            return yzp.e(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? zdm.e(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iC).toString());
            length = str.length() + iC;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iC = zes.c(charSequence, str, length, z);
        } while (iC != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final Sequence<String> b(CharSequence charSequence) {
        zcp.c(charSequence, "");
        return new c(charSequence);
    }

    public static final List<String> c(CharSequence charSequence) {
        zcp.c(charSequence, "");
        return zdz.c((Sequence) zes.b(charSequence));
    }

    public static final CharSequence a(CharSequence charSequence) {
        zcp.c(charSequence, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zB = zek.b(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zB) {
                    break;
                }
                length--;
            } else if (zB) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final boolean d(CharSequence charSequence) {
        zcp.c(charSequence, "");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!zek.b(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
