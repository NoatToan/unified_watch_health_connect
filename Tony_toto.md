# Tony's to-do: vendor cloud OAuth (Garmin / Huawei / Xiaomi)

Status: **research done, nothing built**. All vendor facts below were checked live on **2026-11-13**
unless a row says otherwise. These programs change often (Garmin's closed for about 7 months in
2026 and reopened on 2026-10-21), so check each link again before you sign anything.

Legend: **[Verified]** = read on the vendor's own page or document. **[Reported]** = from a
third-party write-up, not confirmed on a vendor page. **[Unverified]** = could not confirm, so
check it in the vendor console.

---

## 0. Read this first: this goes against a settled product decision

`docs/DECISIONS.md` **D-001** says data stays on the device and there is no backend. **D-803**
lists "Account/cloud login" as out of scope *because it needs a backend*. Every vendor path below
needs a server. Garmin Starter only *pushes* data to a public HTTPS endpoint, and none of the
client secrets can ship in the APK. So this feature changes D-001/D-803. It is not just one more
module. Please confirm that you accept a backend (and the hosting, privacy and GDPR duties that
come with it) before any code is written. D-1223 (Tạm) records this scoping.

---

## 1. Summary

| Brand | Official third-party cloud OAuth API? | OAuth | Cost / tier | Approval difficulty | Verdict |
|---|---|---|---|---|---|
| **Garmin** | Yes. Garmin Connect Developer Program (Health, Activity, Women's Health, Training, Courses APIs) | OAuth 2.0 + PKCE (no scopes; the user ticks permissions on Garmin's consent screen) | **Personal**: free, your own account only, pull. **Starter**: free, "Limited" users (~1,000 reported), **push only, no history**. **Enterprise**: $1,000 entry fee + negotiated per-active-user billing (from 2027-04-01), push or ping/pull, 1 month+ backfill | Low to medium. Starter is reported as fast; one to four weeks to integrate | **Recommended** (start with Starter) |
| **Huawei** | Yes. Health Kit / "Health Service Kit", cloud-side REST (`health-api.cloud.huawei.com/healthkit/v2`) | OAuth 2.0 authorization code via HUAWEI ID (Account Kit); scopes like `https://www.huawei.com/healthkit/step.read` | Free API. Data access depends on **developer type** | **High**. Individual developers get basic data only (steps/distance/calories) and may need an app on AppGallery. HR, sleep, SpO2 and stress need an **enterprise** account. Manual review takes about 10-15 working days | **Possible but costly** (only worth it with a registered company) |
| **Xiaomi** | Partly. An official "小米运动健康云服务" (`hlthopen.io.mi.com`, OAuth 2.0) exists, but it is **open only to Xiaomi ecosystem-chain companies and partners** and the docs say **mainland China only**. There is no self-serve program for global Mi Fitness accounts | OAuth 2.0 (Xiaomi Account), partner client_id | Partnership only, not public | **Effectively closed** for us | **Not viable** officially. Do not use unofficial reverse-engineered APIs (see §4.4) |

---

## 2. Garmin: Garmin Connect Developer Program

### 2.1 What it is today
- Program page (tiers, APIs): https://developer.garmin.com/gc-developer-program/overview/ **[Verified 2026-11-13]**
  - **Personal**: "Individuals exploring ideas", **pull only**, Activity (JSON & .FIT), Health (JSON) and Women's Health (JSON).
  - **Starter (Business)**: "Organizations from individual developers to startups", user capacity "Limited", **"Push only"**, historical data **"Not included"**, Activity, Courses, Health, Training and Women's Health APIs.
  - **Enterprise (Business)**: user capacity "Unlimited", **"Push or Ping/Pull"**, historical data "1 month +", adds the Golf API, terms "tailored based on business and technical requirements".
- OAuth 2.0 PKCE spec (Garmin PDF): https://developerportal.garmin.com/sites/default/files/OAuth2PKCE_1.pdf **[Verified 2026-11-13]**
  - Authorize: `https://apis.garmin.com/tools/oauth2/authorizeUser`
  - Token: `https://diauth.garmin.com/di-oauth2-service/oauth/token`
  - Garmin user ID / permissions: `https://apis.garmin.com/wellness-api/rest/user/permissions`
  - User registration (call DELETE on it to disconnect a user): `https://apis.garmin.com/wellness-api/rest/user/registration`
  - The spec does not give access or refresh token lifetimes. **[Unverified]** Read them in the portal once you are approved.
- No OAuth scopes. "Garmin does not use OAuth scopes in authorization or token requests, users choose permissions on the consent screen." Credentials are the OAuth2 **Client ID** and **Client Secret** from the developer portal: https://nango.dev/docs/api-integrations/garmin-oauth2/how-to-register-your-own-garmin-oauth2-api-oauth-app **[Reported 2026-11-13]**
- History of the program in 2026 **[Reported]**:
  - Closed to new applications from about March 2026 ("Under Construction"): https://tryterra.co/blog/garmin-connect-developer-program-pause
  - Reopened **2026-10-21** with the three tiers. Personal and Starter are free. Enterprise has a $1,000 entry fee credited to the monthly-active-user bill, billing for existing partners starts **2027-04-01**, and Starter is capped at 1,000 users: https://www.dcrainmaker.com/2026/10/garmin-connect-api-revamps-connect-developer.html and https://sahha.ai/blog/garmin-connect-api-reopened-fees/
  - Garmin is removing "VO2 max estimates, recovery time and performance condition" from third-party API deliveries (from **2026-10-06**, per Sahha).
  - Developer Program Agreement Rev. B (March 2026), per Sahha. Displayed data **must carry Garmin attribution** (cl. 6.4). No sublicensing or sharing with third parties (5.2(e), 5.2(o)). Garmin may terminate on 30 days' notice (9.2). AI training on user data needs explicit, withdrawable per-user consent (15.10). DC Rainmaker also reports a ban on building AI models or knowledge bases from "Garmin Device Sourced Data".
- Personal API key (useful only for your own testing) **[Reported]**: https://appsforstrava.com/blog/garmin-connect-developer-program-personal-api-key
  - You create it on Garmin Connect web. It is valid for 30, 90 or 180 days, or 1 year. Access tokens last 24 h and there are **no refresh tokens**. It "may be used only by you" and is not for apps that serve other people.
- Practical numbers **[Reported, confirm in portal]**: 100 requests/min, a one-time 30-day backfill of sleeps, dailies, activities, activityDetails and hrv (Enterprise), and webhooks must return HTTP 200 within a few seconds. Source: https://openwearables.io/blog/garmin-connect-api-developer-guide-activities-health-metrics

### 2.2 What Tony must do (Garmin)
1. **Optional, today, 5 minutes:** create a **Personal API Key** on Garmin Connect web for your own account (30 or 90 days). This lets us prototype the cloud data mapping against real data from your own watch without any business approval. It is for your own data only, so it can never go into the shipped app.
2. Decide which legal identity applies (yourself or a company). Starter allows "individual developers to startups", but the agreement is a business contract, so use the entity that will publish the app.
3. Go to https://developer.garmin.com/gc-developer-program/overview/ and click **Request now / Apply** for **Starter**. Fill in the company details, app description and use case. Tick only the APIs we need: **Health API, Activity API**, and Women's Health if you want cycle data. Read and accept the **Garmin Connect Developer Program Agreement**. Note the clauses on attribution, AI and termination (§2.1).
4. Once approved, open the developer portal (https://developerportal.garmin.com/). Create an app, or convert one to OAuth2, and:
   - copy the **Client ID** and **Client Secret** (OAuth2), and record which environment they belong to (evaluation or production);
   - register the **Redirect / Callback URL**. It must be the backend URL from §5 (for example `https://<our-backend-host>/oauth/garmin/callback`), not an `app://` scheme, because the code exchange happens on the server;
   - in the API configuration (push endpoints), register our backend's public HTTPS **push URLs** for each summary type we enable (dailies, sleeps, HRV, stress, activities, …), plus the **deregistration** and **user-permission-change** notification URLs. **[Unverified]** The exact field names are only visible after login, so screenshot that page for me.
5. Hand over the secrets as described in §7.

### 2.3 Gotchas (Garmin)
- **Starter is push only and has no history.** Garmin POSTs data to *our server* after the user syncs their watch with Garmin Connect. A server that is up all the time is mandatory. The phone cannot receive these pushes.
- No history before the user connects, unless we pay for Enterprise (1 month or more).
- If we go past about 1,000 users we must move to Enterprise ($1,000 entry plus per-MAU billing).
- Required attribution in our UI ("Garmin" branding rules). We may not pass the data to third parties.
- Deregistration: when a user disconnects in Garmin Connect, Garmin notifies us and we must stop pulling and delete their data, which is also a GDPR obligation for us. When a user disconnects in *our* app, we must call `DELETE …/user/registration`.
- Overlap with our BLE driver: Garmin watches are already synced locally over BLE (`:driver:garmin`). The cloud path is mainly useful for users who keep the watch paired with Garmin Connect, or who want the data Garmin has already aggregated. We must de-duplicate cloud and BLE records of the same day (§5.4).
- Garmin removes some metrics from API data without warning (VO2 max and others from 2026-10-06), so never build a feature that depends on a single Garmin-computed field.

---

## 3. Huawei: Health Kit (Health Service Kit), cloud-side REST

### 3.1 What it is today
- Product page: https://developer.huawei.com/consumer/en/hms/huaweihealth/ ("Serves users in 170+ countries and regions") **[Verified 2026-11-13]**
- Cloud-side authorization guide ("Open Authorization in Huawei Health"): https://developer.huawei.com/consumer/en/doc/HMSCore-Guides/server-app-auth-example-0000001071757151 (the page loads its content with JavaScript, so WebFetch could only read its outline) **[Verified that the page exists]**
- OAuth: authorization code via HUAWEI ID (Account Kit). The token endpoint is `https://oauth-login.cloud.huawei.com/oauth2/v3/token`. The authorization code is valid for 5 minutes and single-use. The **access token is valid about 60 minutes** and is renewed with the refresh token. **[Reported, from Huawei Account Kit docs via search, 2026-11-13]** The authorize endpoint `…/oauth2/v3/authorize` and the refresh-token lifetime are **[Unverified]**. This is a web OAuth flow, so the phone does **not** need HMS Core or AppGallery installed.
- Scopes follow `https://www.huawei.com/healthkit/<type>.read|write|both`, for example `…/sleep.read`, `…/heartrate.read`, `…/activityrecord.read`: https://developer.huawei.com/consumer/en/doc/development/HMS-Plugin-Guides-V1/scopes-0000001074269582-V1 **[Reported via search]**
- REST base: `https://health-api.cloud.huawei.com/healthkit/v2/…` (`sampleSet:dailyPolymerize`, `sampleSet:polymerize`, `healthRecords`, …): https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/sampleset_daily_polymerize-0000001078113560 **[Reported via search]**
- **Only data created after the user authorizes** can be read, unless we also get the **historical-data scope** (week, month or year before authorization). That scope needs a separate application on the Health Service Kit card: https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/historydata-open-0000001209921350 **[Reported via search]**
- **Developer-type restriction (the main blocker):**
  - Individual developers: "if your app has not been released on AppGallery, or the app is not a mobile app, Health Service Kit data will not be open to your app". Basic openness level only. "User data with the advanced openness level is currently not open to individual developers." **[Reported via search of Huawei docs]**
  - A real-world individual application was **rejected** ("Individual developers cannot apply for health-related data"). Individuals effectively get only steps, distance and calories, and HR, sleep, stress, SpO2 and temperature need enterprise: https://github.com/ucsky/ha-huawei-health-kit **[Reported]**
  - The Gladys integration says the review takes "about 10 working days" and a test approval "allows up to 100 users": https://gladysassistant.com/docs/integrations/external/huawei-health/ **[Reported]**
  - A 2026-10-24 research note gives these figures: real-name verification 1-2 working days, test permissions about 10 working days, formal permissions about 15 working days, about 6 weeks in total, more if rejected. For the **China site**, the enterprise must have **≥ ¥5M paid-in capital and be at least 1 year old**: https://github.com/SongyuQi-Francisco/Watch2Whoop/issues/253 **[Reported]**
  - Enterprise identity verification takes 1-2 working days and needs a business licence: https://developer.huawei.com/consumer/en/doc/start/mracoei-0000001062678404 **[Reported via search]**
- Region: Huawei accounts are served by regional sites. Gladys says "Accounts registered outside Europe are served by another Huawei site", so the backend must handle site routing. **[Reported]** Some HarmonyOS "Health Service Kit" atomic-service docs say "currently available only in the Chinese mainland". That applies to the HarmonyOS atomic-service variant, not to the HMS Core REST path the integrations above use outside China. **[Unverified for Vietnam-registered accounts, so test with your own Huawei ID]**

### 3.2 What Tony must do (Huawei)
1. Decide whether to apply as an **enterprise**. As an individual, expect step, distance and calorie totals at most, and possibly a rejection. If you have a company with a business licence, register it as an enterprise developer.
2. Create or sign in to a **HUAWEI Developers** account (https://developer.huawei.com) and complete **real-name identity verification** (individual or enterprise).
3. In **AppGallery Connect**, create a project and an app. Note the **App ID** and **App secret**. In the HUAWEI Developers console, under **HUAWEI ID → Apply for HUAWEI ID**, create the OAuth client. Product type is **Server app** or **Web app**, not "Android app", because the token exchange is on our server. This gives you the **Client ID** and **Client Secret**.
4. Register the **Redirect URI / Callback URL** on that client, for example `https://<our-backend-host>/oauth/huawei/callback`.
5. In the console, go to **Health Service Kit → Apply for Health Service Kit**. For each data permission, write a usage scenario. Request at least these reads: step, distance, calories, heartrate, sleep, SpO2, stress, body temperature, body fat/weight, activityrecord. Also apply for the **read-historical-data** scope (month or year). Expect a manual review of about 10-15 working days. Approval is first for **test** use (up to 100 users), and a second review is needed for production.
6. Huawei may ask for a published AppGallery listing and a privacy policy URL. Have both ready.
7. Hand over the secrets as described in §7.

### 3.3 Gotchas (Huawei)
- Individual accounts are effectively limited to the basic data level, so the feature would be weak without a company.
- Data before authorization is missing unless the historical scope is approved.
- Access tokens last about 1 hour, so the backend must refresh often.
- Data is mostly hour-level aggregates. One report says RMSSD HRV is an integer in ms, capped at 200, with no beat-to-beat data. Cloud data is coarser than our BLE driver data.
- Overlap with `:driver:huawei` (BLE): same de-duplication need as Garmin.

---

## 4. Xiaomi: no usable official path for us

### 4.1 What exists officially
- Xiaomi HyperOS developer platform, "小米运动健康云服务接口" (Xiaomi sports-health cloud service API): https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2328 **[Verified that the page exists, 2026-11-13]** It uses OAuth2 (`clientId`, `access_token`), the data host `hlthopen.io.mi.com/healthkit/…`, and webhook signatures (`x-notification-signature`, HMAC-SHA256 with the AppSecret).
- Business intro: https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2325 (updated 2026-08-27). It is offered "为生态合作伙伴与开发者" (for ecosystem partners and developers). Contact: developer@xiaomi.com. **[Verified]**
- Client integration guide: https://dev.mi.com/xiaomihyperos/documentation/detail?pId=2332 (updated 2026-10-22). It requires **HyperOS 4.0+**, a Xiaomi-account login and per-data-type user consent, and says it "currently supports China mainland". The steps are: apply for the Xiaomi Account service, apply for the Xiaomi Sports Health service, then integrate the SDK. **[Verified]**
- Xiaomi's own platform doc says access is "**currently available only to Xiaomi ecological chain companies and partners**": https://www.scribd.com/document/890296613/Xiaomi-Health-Cloud-Open-Platform-User-Documentation **[Reported, mirror of the Xiaomi doc]**
- The public Mi Account scope list (https://dev.mi.com/docs/passport/en/scopes/) shows only one fitness scope, 13002 "Save xiaomi user's fitness data to Mi Cloud", which is write-only. There is no public read scope. **[Verified]**
- Independent confirmation: "Xiaomi publishes no health API for third parties" (https://github.com/soma-intelligence/open-health-sync/blob/main/docs/connectors/xiaomi.md), and "the manufacturer doesn't provide a ready-made open API" (https://habr.com/en/articles/1057044/, 2026-07-09). **[Reported]**

### 4.2 Verdict
Xiaomi does have an official cloud health platform. It is **partner-only (ecosystem-chain companies), mainland-China, and HyperOS-4-centred**, and there is no self-serve application for a global Mi Fitness user base. For this project it is **not viable**. The only official route would be a business partnership negotiated by email (developer@xiaomi.com), which is outside what Claude Code can do or plan for.

### 4.3 Recommended way to handle the gap
1. **Keep the BLE driver as the Xiaomi path.** `:driver:xiaomi` (D-1217..D-1221) already syncs the watch locally.
2. **Optional, no backend:** Mi Fitness can sync to **Android Health Connect** (per open-health-sync). The app currently only *writes* to Health Connect. *Reading* other apps' Health Connect records would cover Xiaomi users who keep Mi Fitness. That is a separate small feature that fits D-001 and needs no OAuth or backend.
3. **Optional:** write to developer@xiaomi.com to ask about partnership access, but expect China-only.

### 4.4 Unofficial routes: recommended NO
Community projects (for example mihealth-api https://github.com/Aaron-gx/mihealth-api, the older MiFit/Huami "hacking" APIs) log in with the user's **Xiaomi password** against private endpoints. This:
- breaks **D-004** (we don't copy GPL code and don't embed vendor secrets or keys) and very likely Xiaomi's Terms of Service;
- makes us handle the user's Xiaomi password, which is a credential-handling and liability problem;
- breaks without notice when Xiaomi changes its private API.

Do it only if you explicitly accept the ToS and legal risk in writing (a new D-entry). My recommendation is **don't**.

---

## 5. Proposed implementation plan (architecture only, no code yet)

### 5.1 New infrastructure: a backend (does not exist today)
- **Why it is required:** (a) **Client Secrets** (Garmin, Huawei) must never be inside the APK, because anyone can extract them. (b) Garmin Starter delivers data **only by push** to a public HTTPS URL. (c) Huawei and Garmin require a registered redirect/callback URL that does the code exchange with the secret.
- **Shape:** a small **OAuth broker + data relay** service, separate from the Android repo (or in a new top-level folder agreed later):
  - `/oauth/<brand>/start`: creates the PKCE verifier and `state`, then redirects to the vendor authorize URL.
  - `/oauth/<brand>/callback`: exchanges the code for tokens using the secret, stores the tokens encrypted on the server, then redirects back to the app with a **short-lived one-time link code** (an App Link / Custom Tab return). Vendor tokens are never sent to the phone.
  - Garmin push receivers: they store incoming summaries in a per-user **outbox**, and the phone pulls the outbox and acknowledges what it received.
  - Huawei poller: the server refreshes tokens (they expire after about 1 h) and pulls new sample sets into the same outbox.
  - Deregistration and permission-change webhooks, and "delete my data" for each user.
- **Privacy stance, to keep the spirit of D-001:** the server is a *relay*, not a store. It deletes outbox data once the phone confirms it has it, keeps only the vendor tokens, and Room on the phone stays the source of truth. You still need a privacy policy and GDPR process, because health data is *special-category* data.
- **App ↔ backend auth:** the app needs its own identity with the backend, for example an anonymous device account with a server-issued token stored in Android Keystore-backed storage. This is a new concept for the app. It is not a user "login" screen, but it is still an account.
- **Hosting choice:** for you to decide (any HTTPS host with a small DB and a secret store). It needs a stable public domain for the redirect URIs and push URLs. Decide this **before** registering URIs with Garmin and Huawei, because changing them later means editing them in both consoles.

### 5.2 Android side (conceptual, consistent with current layering)
- A new **cloud-accounts concept** that sits alongside BLE devices, not inside `core:ble`:
  - `core:model`: pure types for a linked cloud account (brand, link state, last sync, granted permissions).
  - `core:domain`: a *cloud account repository* interface beside the existing `WearableDeviceRepository` (link, unlink, list, sync now), plus use cases.
  - `core:data` (or a new `core:cloud` module): the backend API client, the stored backend token, the outbox pull, and mapping into existing records.
  - `feature:*`: a "Connected accounts" screen (link with Garmin / Huawei, status, unlink, Garmin attribution). It can live in `feature:profile` or a new `feature:cloud-accounts`.
  - The OAuth UI uses **Chrome Custom Tabs**, never a WebView (vendors and Google block WebView OAuth). It returns to the app through a verified **App Link** carrying the one-time link code.
- Background sync: reuse the app's existing periodic sync/WorkManager approach to pull the backend outbox.

### 5.3 Tokens
- Vendor access and refresh tokens **live only on the backend**, encrypted at rest. The phone only holds its own backend credential, kept in Keystore-backed storage.
- Refresh: Huawei roughly every hour, server-side. Garmin's lifetime is unverified, so read it in the portal and implement refresh on the server.
- Revocation: "Unlink" in the app → the backend calls the vendor's revoke or deregister (Garmin `DELETE …/user/registration`), deletes the tokens, and purges the outbox. A vendor-side revocation webhook does the same thing in the other direction.

### 5.4 Mapping into `HealthRecord`
- Cloud data maps onto the **existing** `HealthRecord` types in `core/model/.../HealthRecord.kt`, the same way the BLE drivers already do. No new subtypes in this plan. Anything with no matching type stays out of scope, as decided for the Xiaomi M4 parsers.
- Each record gets a **source tag** (cloud brand vs BLE driver), so that the same day or workout from the cloud and from the BLE driver of the same watch is **de-duplicated**. Proposed rule: prefer BLE (finer-grained) when both exist. To be decided in D-1223's follow-up.
- Writing to Health Connect keeps the current path. Make sure cloud-sourced records are not written twice.

### 5.5 Milestones
| Milestone | Content | Blocked on Tony |
|---|---|---|
| **M0** | Decide to amend D-001/D-803. Pick the backend host and domain. Backend skeleton: app-device auth, OAuth start/callback framework, encrypted token store, outbox, delete-my-data. Privacy policy draft | Host/domain choice, privacy policy owner |
| **M0.5** (optional) | Prototype the Garmin JSON → `HealthRecord` mapping using **your Personal API key** (your own data, off the shipped path) | Personal key (§2.2 step 1) |
| **M1** | Garmin Starter: PKCE link flow, push receivers, deregistration and permission webhooks, outbox → app, the Connected-accounts UI with attribution, BLE/cloud dedupe | Garmin Starter approval + Client ID/Secret + registered URLs |
| **M2** | Huawei: HUAWEI ID OAuth, scopes, server poller with 1 h refresh, site routing, historical scope if granted | Huawei enterprise verification + Health Service Kit approval (expect 3-6 weeks) |
| **M3** | Xiaomi: **not via cloud.** Optionally, a Health Connect *read* feature that covers Mi Fitness users (no backend) | Only your go/no-go |
| Later | Garmin Enterprise (more than 1,000 users, history, pull) if usage justifies the fees | Commercial agreement |

---

## 6. What's missing or blocked today
- **No code exists** for any of this: no backend, no OAuth, no cloud-account concept in the app.
- **D-001 / D-803 conflict** must be resolved by you first (§0).
- **Garmin:** waiting on your Starter application. The program only reopened on 2026-10-21, so expect some turbulence.
- **Huawei:** blocked on whether you have or will use a **registered company**. As an individual, the useful data (HR, sleep) is not available.
- **Xiaomi:** **no official path open to us** (partner-only, China mainland). Unofficial path not recommended (§4.4).
- **Repo hygiene:** `.gitignore` today ignores `local.properties` and keystores but **not `.env`**. If secrets are ever put in a file under the repo, `.env*` must be added to `.gitignore` first. Better, keep them outside the repo (§7).

---

## 7. Action items for Tony (only you can do these)

Order of priority: Garmin, then the backend decision, then Huawei. Xiaomi is a decision only.

**Decisions**
- [ ] Confirm that you accept amending D-001/D-803: a backend relay for cloud accounts, plus a privacy policy and GDPR duties.
- [ ] Choose the backend host and a stable domain (needed before any redirect or push URL is registered).
- [ ] Decide the legal entity (personal or company) used for the Garmin and Huawei developer agreements.
- [ ] Xiaomi: confirm "no cloud". Choose between nothing and the Health Connect read feature (§4.3). Only if you want the unofficial route despite §4.4, say so explicitly so it gets its own decision entry.

**Garmin**
- [ ] (Optional, now) Create a Garmin **Personal API Key** on Garmin Connect web, 30-90 days, for prototyping with your own data.
- [ ] Apply for the **Starter** tier at https://developer.garmin.com/gc-developer-program/overview/. Choose Health + Activity (+ Women's Health) and accept the Developer Program Agreement.
- [ ] After approval, in https://developerportal.garmin.com/: create the OAuth2 app and copy the **Client ID** and **Client Secret**.
- [ ] Register the **Redirect/Callback URL**, the **push URLs** for each data type, and the **deregistration** and **user-permission** URLs (I will give you the exact URLs after M0).
- [ ] Screenshot the portal's endpoint-configuration page and token-lifetime info for me (no secrets in the screenshot).

**Huawei**
- [ ] Complete **HUAWEI Developers** identity verification. Use enterprise if possible (business licence).
- [ ] In AppGallery Connect, create the project and app and note the **App ID / App secret**. Under HUAWEI ID, create a **Server/Web app** OAuth client and note the **Client ID / Client Secret**.
- [ ] Register the **Redirect URI** (given after M0).
- [ ] **Apply for Health Service Kit** with the scopes in §3.2 step 5 plus the historical-data scope, write a usage scenario for each, and wait for the review (about 10-15 working days).
- [ ] Prepare a privacy policy URL, and an AppGallery listing if Huawei asks for one.

**Handing secrets to Claude Code safely**
- [ ] **Never** paste a Client Secret, App secret, Personal API key or token into chat, an issue, a commit or this file.
- [ ] Store them **outside the repo**, for example in your password manager, or a local file such as `~/.config/unified-health/cloud-secrets.env` with `chmod 600`. Use field names like `GARMIN_CLIENT_ID`, `GARMIN_CLIENT_SECRET`, `HUAWEI_CLIENT_ID`, `HUAWEI_CLIENT_SECRET`, `HUAWEI_APP_ID`.
- [ ] For deployment, put them in the backend host's **secret manager / environment variables**, never in the APK, `gradle.properties` or any committed file.
- [ ] Tell Claude Code only *that* the secrets exist and *where* (the file path or variable names). Claude Code will make the code read them from the environment. Client IDs and redirect URIs are not secret and can be shared in chat.
- [ ] If a secret ever leaks (committed or pasted), rotate it in the vendor console immediately.
