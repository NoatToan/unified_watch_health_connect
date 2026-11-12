package defpackage;

import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.CardGroupType;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.IssueCardListResponse;
import com.miui.tsmclient.net.TSMAuthContants;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zgt extends SecureRequest<IssueCardListResponse> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardInfo f41264b;

    public zgt(CardInfo cardInfo) {
        super("POST", TSMAuthContants.QUERY_QUERY_ISSUED_CARD_LIST, IssueCardListResponse.class);
        this.f41264b = cardInfo;
        addParams("type", String.valueOf(CardGroupType.TRANSCARD.getId()));
        if (cardInfo != null) {
            addParams("cardName", cardInfo.mCardType);
        }
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            if (this.f41264b == null) {
                this.f41264b = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
            }
            addParams("cplc", this.f41264b.getTerminal().getCPLC());
        } catch (IOException e) {
            e = e;
            Thread.currentThread().interrupt();
            throw new IOException("QueryIssuesCardListRequest getExtraParams failed", e);
        } catch (InterruptedException e2) {
            e = e2;
            Thread.currentThread().interrupt();
            throw new IOException("QueryIssuesCardListRequest getExtraParams failed", e);
        }
    }
}
