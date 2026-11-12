package okhttp3.internal.ws;

import ch.qos.logback.core.CoreConstants;
import d53.t;
import d53.u;
import d53.w;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebSocketExtensions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public /* synthetic */ WebSocketExtensions(boolean z14, Integer num, boolean z15, Integer num2, boolean z16, boolean z17, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? false : z17);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z14, Integer num, boolean z15, Integer num2, boolean z16, boolean z17, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = webSocketExtensions.perMessageDeflate;
        }
        if ((i14 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i14 & 4) != 0) {
            z15 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i14 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i14 & 16) != 0) {
            z16 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i14 & 32) != 0) {
            z17 = webSocketExtensions.unknownValues;
        }
        boolean z18 = z16;
        boolean z19 = z17;
        return webSocketExtensions.copy(z14, num, z15, num2, z18, z19);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean perMessageDeflate, Integer clientMaxWindowBits, boolean clientNoContextTakeover, Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && s.g(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && s.g(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z14 = this.perMessageDeflate;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i14 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z15 = this.clientNoContextTakeover;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (iHashCode + r15) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i15 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z16 = this.serverNoContextTakeover;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i16 = (iHashCode2 + r16) * 31;
        boolean z17 = this.unknownValues;
        return i16 + (z17 ? 1 : z17);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb3.append(this.perMessageDeflate);
        sb3.append(", clientMaxWindowBits=");
        sb3.append(this.clientMaxWindowBits);
        sb3.append(", clientNoContextTakeover=");
        sb3.append(this.clientNoContextTakeover);
        sb3.append(", serverMaxWindowBits=");
        sb3.append(this.serverMaxWindowBits);
        sb3.append(", serverNoContextTakeover=");
        sb3.append(this.serverNoContextTakeover);
        sb3.append(", unknownValues=");
        return am.j.t(sb3, this.unknownValues, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final WebSocketExtensions parse(Headers responseHeaders) {
            String strS;
            responseHeaders.getClass();
            int size = responseHeaders.size();
            boolean z14 = false;
            Integer numI = null;
            boolean z15 = false;
            Integer numI2 = null;
            boolean z16 = false;
            boolean z17 = false;
            for (int i14 = 0; i14 < size; i14++) {
                if (u.q(responseHeaders.name(i14), "Sec-WebSocket-Extensions", true)) {
                    String strValue = responseHeaders.value(i14);
                    int i15 = 0;
                    while (i15 < strValue.length()) {
                        int i16 = i15;
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, CoreConstants.COMMA_CHAR, i16, 0, 4, (Object) null);
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i16, iDelimiterOffset$default);
                        String strTrimSubstring = Util.trimSubstring(strValue, i16, iDelimiterOffset);
                        int i17 = iDelimiterOffset + 1;
                        if (!u.q(strTrimSubstring, "permessage-deflate", true)) {
                            i15 = i17;
                            z17 = true;
                        } else if (z14) {
                            z17 = true;
                        } else {
                            z17 = true;
                            while (i17 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strValue, ';', i17, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i17, iDelimiterOffset2);
                                String strTrimSubstring2 = Util.trimSubstring(strValue, i17, iDelimiterOffset3);
                                if (iDelimiterOffset3 < iDelimiterOffset2) {
                                    String strTrimSubstring3 = Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2);
                                    strTrimSubstring3.getClass();
                                    strS = w.S(strTrimSubstring3, "\"", "\"");
                                } else {
                                    strS = null;
                                }
                                i17 = iDelimiterOffset2 + 1;
                                if (u.q(strTrimSubstring2, "client_max_window_bits", true)) {
                                    if (numI != null) {
                                        z17 = true;
                                    }
                                    numI = strS != null ? t.i(strS) : null;
                                    if (numI == null) {
                                        z17 = true;
                                    }
                                } else if (u.q(strTrimSubstring2, "client_no_context_takeover", true)) {
                                    if (z15) {
                                        z17 = true;
                                    }
                                    if (strS != null) {
                                        z17 = true;
                                    }
                                    z15 = true;
                                } else {
                                    if (u.q(strTrimSubstring2, "server_max_window_bits", true)) {
                                        if (numI2 != null) {
                                            z17 = true;
                                        }
                                        numI2 = strS != null ? t.i(strS) : null;
                                        if (numI2 == null) {
                                        }
                                    } else if (u.q(strTrimSubstring2, "server_no_context_takeover", true)) {
                                        if (z16) {
                                            z17 = true;
                                        }
                                        if (strS != null) {
                                            z17 = true;
                                        }
                                        z16 = true;
                                    }
                                    z17 = true;
                                }
                            }
                            i15 = i17;
                            z14 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z14, numI, z15, numI2, z16, z17);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions(boolean z14, Integer num, boolean z15, Integer num2, boolean z16, boolean z17) {
        this.perMessageDeflate = z14;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z15;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z16;
        this.unknownValues = z17;
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }
}
