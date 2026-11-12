package com.amazon.alexa.avs;

import com.amazon.alexa.avs.http.MultipartParser;
import com.amazon.alexa.avs.log.Logger;
import com.amazon.alexa.avs.log.LoggerFactory;
import com.amazon.alexa.avs.message.response.AttachedContentPayload;
import com.amazon.alexa.avs.message.response.Directive;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class DirectiveEnqueuer implements MultipartParser.MultipartParserConsumer {
    private static final Logger log = LoggerFactory.getLogger(DirectiveEnqueuer.class);
    private final Queue<Directive> dependentQueue;
    private final DialogRequestIdAuthority dialogRequestIdAuthority;
    private final DirectiveDispatcher dispatcher;
    private final Queue<Directive> independentQueue;
    private ExecutorService executor = new ThreadPoolExecutor(0, 100, 60, TimeUnit.SECONDS, new SynchronousQueue());
    private final Queue<Directive> incompleteDirectiveQueue = new LinkedList();
    private final Map<String, InputStream> attachments = new HashMap();

    public DirectiveEnqueuer(DialogRequestIdAuthority dialogRequestIdAuthority, Queue<Directive> queue, Queue<Directive> queue2, DirectiveDispatcher directiveDispatcher) {
        this.dialogRequestIdAuthority = dialogRequestIdAuthority;
        this.dependentQueue = queue;
        this.independentQueue = queue2;
        this.dispatcher = directiveDispatcher;
    }

    private void enqueueDirective(final Directive directive) {
        String dialogRequestId = directive.getDialogRequestId();
        Logger logger = log;
        logger.debug("dialogRequestId : " + dialogRequestId);
        if (shouldBypassQueue(dialogRequestId, directive)) {
            logger.debug("shouldBypassQueue  ");
            this.executor.execute(new Runnable() { // from class: com.amazon.alexa.avs.DirectiveEnqueuer.1
                @Override // java.lang.Runnable
                public void run() {
                    DirectiveEnqueuer.this.dispatcher.dispatch(directive);
                }
            });
        } else if (dialogRequestId == null) {
            logger.debug("independentQueue  ");
            this.independentQueue.add(directive);
        } else if (this.dialogRequestIdAuthority.isCurrentDialogRequestId(dialogRequestId)) {
            logger.debug("dependentQueue  ");
            this.dependentQueue.add(directive);
        }
    }

    private void findCompleteDirectives() {
        Iterator<Directive> it2 = this.incompleteDirectiveQueue.iterator();
        while (it2.hasNext()) {
            Directive next = it2.next();
            Object payload = next.getPayload();
            if (!(payload instanceof AttachedContentPayload)) {
                log.debug("Immediately enqueue directive content: " + next);
                enqueueDirective(next);
                it2.remove();
            } else {
                if (((AttachedContentPayload) payload).requiresAttachedContent()) {
                    log.debug("no attachedContent directive   : " + next);
                    return;
                }
                log.debug("directive : " + next);
                enqueueDirective(next);
                it2.remove();
            }
        }
    }

    private void matchAttachementsWithDirectives() {
        Iterator<Directive> it2 = this.incompleteDirectiveQueue.iterator();
        while (it2.hasNext()) {
            Object payload = it2.next().getPayload();
            if (payload instanceof AttachedContentPayload) {
                AttachedContentPayload attachedContentPayload = (AttachedContentPayload) payload;
                String attachedContentId = attachedContentPayload.getAttachedContentId();
                InputStream inputStreamRemove = this.attachments.remove(attachedContentId);
                if (inputStreamRemove != null) {
                    log.debug("find attached directive " + attachedContentId);
                    attachedContentPayload.setAttachedContent(attachedContentId, inputStreamRemove);
                } else {
                    log.debug("not find attached directive " + attachedContentId);
                }
            } else {
                log.debug("directive is not AttachedContentPayload");
            }
        }
        findCompleteDirectives();
    }

    private boolean shouldBypassQueue(String str, Directive directive) {
        return directive.getNamespace().equals(AVSAPIConstants.TemplateRuntime.NAMESPACE) && (str == null || this.dialogRequestIdAuthority.isCurrentDialogRequestId(str));
    }

    @Override // com.amazon.alexa.avs.http.MultipartParser.MultipartParserConsumer
    public synchronized void onDirective(Directive directive) {
        log.debug("#####onDirective#####");
        this.incompleteDirectiveQueue.add(directive);
        matchAttachementsWithDirectives();
    }

    @Override // com.amazon.alexa.avs.http.MultipartParser.MultipartParserConsumer
    public synchronized void onDirectiveAttachment(String str, InputStream inputStream) {
        Logger logger = log;
        logger.debug("#####onDirectiveAttachment#####");
        logger.debug("onDirectiveAttachment  contentId: " + str);
        this.attachments.put(str, inputStream);
        matchAttachementsWithDirectives();
    }
}
