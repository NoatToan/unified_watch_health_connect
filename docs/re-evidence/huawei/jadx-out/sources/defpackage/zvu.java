package defpackage;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.Message;
import org.eclipse.californium.core.network.Exchange;
import org.eclipse.californium.core.network.MessageExchangeStore;
import org.eclipse.californium.core.network.MessageIdProvider;
import org.eclipse.californium.core.network.TokenGenerator;
import org.eclipse.californium.core.network.deduplication.Deduplicator;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zvu implements MessageExchangeStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54628a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f54629c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Deduplicator f54630b;
    private final Configuration d;
    private volatile boolean e;
    private volatile MessageIdProvider g;
    private ScheduledExecutorService h;
    private ScheduledFuture<?> l;
    private final TokenGenerator m;
    private final String n;
    private final ConcurrentMap<zvv, Exchange> f = new ConcurrentHashMap();
    private final ConcurrentMap<zvt, Exchange> j = new ConcurrentHashMap();
    private volatile boolean i = false;

    static {
        Logger loggerA = aaex.a((Class<?>) zvu.class);
        f54628a = loggerA;
        f54629c = aaex.a(loggerA.getName() + ".health");
    }

    public zvu(String str, Configuration configuration, TokenGenerator tokenGenerator) {
        if (configuration == null) {
            throw new NullPointerException("Configuration must not be null");
        }
        if (tokenGenerator == null) {
            throw new NullPointerException("TokenProvider must not be null");
        }
        this.m = tokenGenerator;
        this.d = configuration;
        this.n = zzp.j(str);
        f54628a.debug("{}using TokenProvider {}", str, tokenGenerator.getClass().getName());
    }

    private void b() {
        ScheduledExecutorService scheduledExecutorService;
        long jLongValue = this.d.e(zyq.f54785b, TimeUnit.MILLISECONDS).longValue();
        if (jLongValue <= 0 || !f54629c.isDebugEnabled() || (scheduledExecutorService = this.h) == null) {
            return;
        }
        this.l = scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: zvu.4
            @Override // java.lang.Runnable
            public void run() {
                if (zvu.this.e) {
                    zvu.this.d(5);
                }
            }
        }, jLongValue, jLongValue, TimeUnit.MILLISECONDS);
    }

    private String c() {
        return this.n + "MessageExchangeStore contents: " + this.f.size() + " exchanges by MID, " + this.j.size() + " exchanges by token, " + this.f54630b.size() + " MIDs.";
    }

    public void d(Deduplicator deduplicator) {
        synchronized (this) {
            if (this.i) {
                throw new IllegalStateException("Cannot set Deduplicator when store is already started");
            }
            if (deduplicator == null) {
                throw new NullPointerException("Deduplicator must not be null");
            }
            this.f54630b = deduplicator;
        }
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public void setExecutor(ScheduledExecutorService scheduledExecutorService) {
        synchronized (this) {
            if (this.i) {
                throw new IllegalStateException("Cannot set messageIdProvider when store is already started");
            }
            this.h = scheduledExecutorService;
        }
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public boolean isEmpty() {
        return this.f.isEmpty() && this.j.isEmpty() && this.f54630b.isEmpty();
    }

    public String toString() {
        return c();
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public int assignMessageId(Message message) {
        int mid = message.getMID();
        if (-1 == mid) {
            InetSocketAddress peerAddress = message.getDestinationContext().getPeerAddress();
            try {
                mid = this.g.getNextMessageId(peerAddress);
                message.setMID(mid);
                return mid;
            } catch (IllegalStateException e) {
                f54628a.debug("{}cannot send message {}-{} to {}, {}", this.n, message.getType(), CoAP.g(message.getRawCode()), zzp.e(peerAddress), e.getMessage());
            }
        }
        return mid;
    }

    private zvv e(Exchange exchange, Message message) {
        zvv zvvVar;
        this.e = true;
        exchange.c(message);
        int mid = message.getMID();
        if (-1 == mid) {
            int iAssignMessageId = assignMessageId(message);
            if (-1 != iAssignMessageId) {
                zvvVar = new zvv(iAssignMessageId, exchange.q());
                if (this.f.putIfAbsent(zvvVar, exchange) != null) {
                    throw new IllegalArgumentException(String.format("generated mid [%d] already in use, cannot register %s", Integer.valueOf(iAssignMessageId), exchange));
                }
                f54628a.debug("{}{} added with generated mid {}, {}", this.n, exchange, zvvVar, message);
            } else {
                zvvVar = null;
            }
        } else {
            zvvVar = new zvv(mid, exchange.q());
            Exchange exchangePutIfAbsent = this.f.putIfAbsent(zvvVar, exchange);
            if (exchangePutIfAbsent == null) {
                f54628a.debug("{}{} added with {}, {}", this.n, exchange, zvvVar, message);
            } else {
                if (exchangePutIfAbsent != exchange) {
                    throw new IllegalArgumentException(String.format("mid [%d] already in use, cannot register %s", Integer.valueOf(mid), exchange));
                }
                if (exchange.m() == 0) {
                    throw new IllegalArgumentException(String.format("message with already registered mid [%d] is not a re-transmission, cannot register %s", Integer.valueOf(mid), exchange));
                }
            }
        }
        if (zvvVar != null) {
            exchange.b(zvvVar);
        }
        return zvvVar;
    }

    private void c(Exchange exchange) {
        zvt keyToken;
        this.e = true;
        zvg zvgVarF = exchange.f();
        exchange.c(zvgVarF);
        zve token = zvgVarF.getToken();
        if (token == null) {
            TokenGenerator.Scope scope = zvgVarF.j() ? TokenGenerator.Scope.SHORT_TERM : TokenGenerator.Scope.SHORT_TERM_CLIENT_LOCAL;
            do {
                zve zveVarCreateToken = this.m.createToken(scope);
                zvgVarF.setToken(zveVarCreateToken);
                keyToken = this.m.getKeyToken(zveVarCreateToken, exchange.q());
            } while (this.j.putIfAbsent(keyToken, exchange) != null);
            f54628a.debug("{}{} added with generated token {}, {}", this.n, exchange, keyToken, zvgVarF);
        } else {
            if (token.b() && zvgVarF.a() == null) {
                return;
            }
            keyToken = this.m.getKeyToken(token, exchange.q());
            Exchange exchangePut = this.j.put(keyToken, exchange);
            if (exchangePut == null) {
                zuv zuvVarJ = zvgVarF.getOptions().j();
                if (zuvVarJ != null) {
                    f54628a.debug("{}block2 {} for block {} add with token {}", this.n, exchange, Integer.valueOf(zuvVarJ.b()), keyToken);
                } else {
                    f54628a.debug("{}{} added with token {}, {}", this.n, exchange, keyToken, zvgVarF);
                }
            } else if (exchangePut != exchange) {
                if (exchange.m() == 0 && !zvgVarF.getOptions().ai() && !zvgVarF.getOptions().af() && !zvgVarF.getOptions().ak()) {
                    f54628a.warn("{}{} with manual token overrides existing {} with open request: {}", this.n, exchange, exchangePut, keyToken);
                } else {
                    f54628a.debug("{}{} replaced with token {}, {}", this.n, exchange, keyToken, zvgVarF);
                }
            } else {
                f54628a.debug("{}{} keep for {}, {}", this.n, exchange, keyToken, zvgVarF);
            }
        }
        if (keyToken != null) {
            exchange.d(keyToken);
        }
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public boolean registerOutboundRequest(Exchange exchange) {
        if (exchange == null) {
            throw new NullPointerException("exchange must not be null");
        }
        if (exchange.f() == null) {
            throw new IllegalArgumentException("exchange does not contain a request");
        }
        zvg zvgVarF = exchange.f();
        if (e(exchange, zvgVarF) == null) {
            return false;
        }
        c(exchange);
        if (exchange.f() == zvgVarF) {
            return true;
        }
        throw new ConcurrentModificationException("Current request modified!");
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public boolean registerOutboundRequestWithTokenOnly(Exchange exchange) {
        if (exchange == null) {
            throw new NullPointerException("exchange must not be null");
        }
        if (exchange.f() == null) {
            throw new IllegalArgumentException("exchange does not contain a request");
        }
        zvg zvgVarF = exchange.f();
        c(exchange);
        if (exchange.f() == zvgVarF) {
            return true;
        }
        throw new ConcurrentModificationException("Current request modified!");
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public void remove(zvt zvtVar, Exchange exchange) {
        if (this.j.remove(zvtVar, exchange)) {
            f54628a.debug("{}removing {} for token {}", this.n, exchange, zvtVar);
        }
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public Exchange remove(zvv zvvVar, Exchange exchange) {
        if (exchange == null) {
            exchange = this.f.remove(zvvVar);
        } else if (!this.f.remove(zvvVar, exchange)) {
            exchange = null;
        }
        if (exchange != null) {
            f54628a.debug("{}removing {} for MID {}", this.n, exchange, zvvVar);
        }
        return exchange;
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public Exchange get(zvt zvtVar) {
        if (zvtVar == null) {
            return null;
        }
        return this.j.get(zvtVar);
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public Exchange get(zvv zvvVar) {
        if (zvvVar == null) {
            return null;
        }
        return this.f.get(zvvVar);
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public boolean registerOutboundResponse(Exchange exchange) {
        if (exchange == null) {
            throw new NullPointerException("exchange must not be null");
        }
        if (exchange.j() == null) {
            throw new IllegalArgumentException("exchange does not contain a response");
        }
        zvf zvfVarJ = exchange.j();
        if (e(exchange, zvfVarJ) == null) {
            return false;
        }
        if (exchange.j() == zvfVarJ) {
            return true;
        }
        throw new ConcurrentModificationException("Current response modified!");
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public void start() {
        synchronized (this) {
            if (!this.i) {
                b();
                if (this.f54630b == null) {
                    this.f54630b = zwd.e().c(this.d);
                }
                this.f54630b.setExecutor(this.h);
                this.f54630b.start();
                if (this.g == null) {
                    f54628a.debug("{}no MessageIdProvider set, using default {}", this.n, zvx.class.getName());
                    this.g = new zvx(this.d);
                }
                this.i = true;
            }
        }
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public void stop() {
        synchronized (this) {
            if (this.i) {
                this.i = false;
                for (Exchange exchange : this.f.values()) {
                    if (exchange.ac()) {
                        exchange.p().setCanceled(true);
                    } else {
                        exchange.r().setCanceled(true);
                    }
                }
                ScheduledFuture<?> scheduledFuture = this.l;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.l = null;
                }
                this.f54630b.stop();
                this.f.clear();
                this.j.clear();
            }
        }
    }

    public void d(int i) {
        Logger logger = f54629c;
        if (logger.isDebugEnabled()) {
            logger.debug(c());
            if (i > 0) {
                if (!this.f.isEmpty()) {
                    b(i, this.f.entrySet());
                }
                if (this.j.isEmpty()) {
                    return;
                }
                b(i, this.j.entrySet());
            }
        }
    }

    private <K> void b(int i, Set<Map.Entry<K, Exchange>> set) {
        for (Map.Entry<K, Exchange> entry : set) {
            Exchange value = entry.getValue();
            zvg zvgVarP = value.p();
            zvg zvgVarF = value.f();
            Object obj = value.ad() ? "/pending" : "";
            if (zvgVarP != null && zvgVarP != zvgVarF && !zvgVarP.getToken().equals(zvgVarF.getToken())) {
                f54629c.debug("  {}, {}, retransmission {}{}, org {}, {}, {}", entry.getKey(), value, Integer.valueOf(value.m()), obj, zvgVarP.getToken(), zvgVarF, value.j());
            } else {
                f54629c.debug("  {}, {}, retransmission {}{}, {}{}, {}", entry.getKey(), value, Integer.valueOf(value.m()), obj, zvgVarP == null ? "(missing origin request) " : "", zvgVarF, value.j());
            }
            Throwable thI = value.i();
            if (thI != null) {
                f54629c.trace("  ", thI);
            }
            i--;
            if (i <= 0) {
                return;
            }
        }
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public Exchange findPrevious(zvv zvvVar, Exchange exchange) {
        return this.f54630b.findPrevious(zvvVar, exchange);
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public boolean replacePrevious(zvv zvvVar, Exchange exchange, Exchange exchange2) {
        return this.f54630b.replacePrevious(zvvVar, exchange, exchange2);
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public Exchange find(zvv zvvVar) {
        return this.f54630b.find(zvvVar);
    }

    @Override // org.eclipse.californium.core.network.MessageExchangeStore
    public List<Exchange> findByToken(zve zveVar) {
        zvg zvgVarP;
        ArrayList arrayList = new ArrayList();
        if (zveVar != null) {
            if (this.m.getScope(zveVar) == TokenGenerator.Scope.SHORT_TERM_CLIENT_LOCAL) {
                throw new IllegalArgumentException("token must not have client-local scope!");
            }
            for (Map.Entry<zvt, Exchange> entry : this.j.entrySet()) {
                if (entry.getValue().ac() && (zvgVarP = entry.getValue().p()) != null && zveVar.equals(zvgVarP.getToken())) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        return arrayList;
    }
}
